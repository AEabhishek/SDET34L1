package com.vtigrer.objectRpositories.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreateOrganisationPage {

	
	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")
	private WebElement orgLnk;

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement crtOrgIcn;

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement OrgNmetxt;

	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement orgsvBtn;
	
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement IndustryDropdown;
	
	@FindBy(xpath = "//select[@name='accounttype']")
	private WebElement TypeDropdown;
	
	
	
	
	public CreateOrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnOrganisationLink()
	{
		orgLnk.click();
	}
	
	public void ClickOnCreateNewOrganisationIcon()
	{
		crtOrgIcn.click();
	}
	
	public void organisationCreated(String value)
	{
		OrgNmetxt.sendKeys(value);
		WebDriverRepository.Sleep(3000);
		
	}
	public void Save()
	{
		orgsvBtn.click();
		WebDriverRepository.Sleep(3000);
	}
	
	public void handleIndustryDropDown()
	{
		WebDriverRepository.HandleDropDown("Engineering", IndustryDropdown);
		WebDriverRepository.Sleep(3000);
	}
	
	public void handleTypeDropDown()
	{
		WebDriverRepository.HandleDropDown("Partner", TypeDropdown);
		WebDriverRepository.Sleep(3000);
	}
	
	
}
