package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator for signon button
	By loc_signIn= By.xpath("//a[contains(text(),'Sign in')]");
	// Method to click on sign in button
		public void clickOnSignInButton()
		{
			driver.findElement(loc_signIn).click();
		}

}
