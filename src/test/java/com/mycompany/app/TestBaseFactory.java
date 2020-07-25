package com.mycompany.app;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.factory.HomePageFactory;
import com.mycompany.factory.LoginPageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseFactory {
	
	 WebDriver driver;
	    HomePageFactory homePage;
	    LoginPageFactory loginPage;
		
		@BeforeTest
		public void initializeFactory() throws IOException { 
			  
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
		
		@Test(priority=1)

	    public void test_Home_Page_Appear_Correct_Factory(){
			
			homePage= new HomePageFactory(driver);
			homePage.clickOnSignInButton();
			loginPage= new LoginPageFactory(driver);
			loginPage.signIn("Amod", "Password");
			System.out.println("Test base factory");	
		}
		
		@AfterTest
	    // Test cleanup 
	    public void TeardownTestFactory() { 
	       driver.quit(); 
	    } 


}
