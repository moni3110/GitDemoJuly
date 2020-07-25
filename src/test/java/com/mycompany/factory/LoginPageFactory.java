package com.mycompany.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	public LoginPageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Locator for sign in button
	@FindBy(id="email")
		WebElement loc_emailAddress;
	@FindBy(id="passwd")
	    WebElement loc_password;
	@FindBy(id="SubmitLogin")
	    WebElement loc_signInButton;
		
		// Type email address
		public void typeEmailAddress(String emailAddress)
		{
			loc_emailAddress.sendKeys(emailAddress);
		}
		
		// Type password
		public void typePassword(String password)
		{
			loc_password.sendKeys(password);
		}
		
		// Click on sign in button
		public void clickOnSignInButton()
		{
			loc_signInButton.click();
		}
		
		// Single method to sign in
		public void signIn(String emailAddress, String password)
		{
			typeEmailAddress(emailAddress);
			typePassword(password);
			clickOnSignInButton();
			
		}

}
