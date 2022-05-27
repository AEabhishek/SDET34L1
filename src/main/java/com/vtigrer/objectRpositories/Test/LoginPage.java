package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

//Create a seperate java class for Every page is a application
public class LoginPage {
	

		@FindBy(xpath = "//input[@name='user_name']")
		private WebElement userNametxt;
		
		@FindBy(xpath = "//input[@name='user_password']" )
		private WebElement passWordtxt;
		
		@FindBy(xpath = "//input[@type='submit']")
		private WebElement lbnBtn;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		
		

		//business library
		
		public void loginAction(String userName, String passWord)
		{
		
			userNametxt.sendKeys(userName);
			passWordtxt.sendKeys(passWord);
			lbnBtn.click();
			
		
		
	}
	
	

}
