package com.mycompany.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	WebDriver driver;
	public HomePageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Locator for signon button
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement loc_signIn;
	// Method to click on sign in button
	
		public void clickOnSignInButton()
		{
			loc_signIn.click();
		}

}
