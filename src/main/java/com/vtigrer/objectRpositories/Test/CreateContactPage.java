package com.vtigrer.objectRpositories.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreateContactPage {
	
	@FindBy(linkText = "Contacts")
	private WebElement crtctLnk;
	
	@FindBy(xpath ="//img[@title='Create Contact...']")
	private WebElement ctIcn;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement ctLstnmtxt;
	
	//@FindBy(linkText = "Contacts")
	//private WebElement ctLnk2;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement orgIcn;
	
	@FindBy(id = "search_txt")
	private WebElement srhtxt;
	
	@FindBy(name = "search")
	private WebElement ctLnk;
	
	@FindBy(name = "search")
	private WebElement srhBtn;
	
	@FindBy(linkText = "aran")
	private WebElement cttxt;
	
	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement svBtn;
	
	
	
	@FindBy(name = "input[@id='search_txt']")
	private WebElement searchTxt;
	
	@FindBy(xpath = "search")
	private WebElement SrhBtn;
	
	@FindBy(linkText =  "aran")
	private WebElement srhByTxt;
	


	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickOnContactLink()
	{
		crtctLnk.click();
	}
	
	public void clickonContactIcon()
	{
		ctIcn.click();
	}
	
	
	
	
    public void CreatedContacts(String Value)
    {
    	
    	
    	ctLstnmtxt.sendKeys(Value);
    	WebDriverRepository.Sleep(3000);
    	
    }
    
    public void ClickOnOrganisationIcon()
    {
    	orgIcn.click();
    	WebDriverRepository.Sleep(3000);
    }
    
    public void switchtowindow(WebDriver driver,String Value1,String value2)
    {
    	WebDriverRepository.switchToWindowBasedOntitle(driver, Value1);
    	srhtxt.sendKeys("aran");
    	WebDriverRepository.Sleep(3000);
    	srhBtn.click();
    	WebDriverRepository.Sleep(3000);
    	cttxt.click();
    	WebDriverRepository.Sleep(3000);
    	WebDriverRepository.switchToWindowBasedOntitle(driver, value2);
    }
    
    public void save()
    {
    	svBtn.click();
    }
    
   
}
