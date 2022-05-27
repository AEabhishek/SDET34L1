package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class  HomePage {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement MoreDrpDn;
	
	@FindBy(linkText = "Campaigns")
	private WebElement CompaignTab;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministratorIcon;
	
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement SignOutLink;
	

	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
		
	public void ClickCompaignAction(WebDriver driver)
	{
	
		WebDriverRepository.mouseHoverOnTheElement(MoreDrpDn, driver);
		
		CompaignTab.click();
	}
	
	
	public void SignOut(WebDriver driver)
	{
	WebDriverRepository.Sleep(3000);
		WebDriverRepository.mouseHoverOnTheElement(AdministratorIcon, driver);
		WebDriverRepository.Sleep(2000);
		SignOutLink.click();
	}
	

}
