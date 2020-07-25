package com.mycompany.app;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.pages.HomePage;
import com.mycompany.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
     WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
	
	@BeforeTest
	public void initialize() throws IOException { 
		  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    
        // To maximize browser 
        driver.manage().window().maximize(); 
    
        // Implicit wait 
        driver.manage().timeouts().implicitlyWait( 
             10, TimeUnit.SECONDS); 
    
        // To open web site 
        driver.get("http://automationpractice.com/index.php"); 
    } 
	
	@Test(priority=0)

    public void test_Home_Page_Appear_Correct(){
		
		homePage= new HomePage(driver);
		homePage.clickOnSignInButton();
		loginPage= new LoginPage(driver);
		loginPage.signIn("Amod", "Password");
        System.out.println("TestBase");	}
	
	@AfterTest
    // Test cleanup 
    public void TeardownTest() { 
       driver.quit(); 
    } 
}
