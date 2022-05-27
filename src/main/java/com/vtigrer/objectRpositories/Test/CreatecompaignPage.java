package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreatecompaignPage {
	
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement cmpIcn;
 
	   @FindBy(name = "campaignname")
	   private WebElement CpgNameTxt;
	   
	   @FindBy(xpath = "//input[@accesskey='S']")
	   private WebElement svBtn;
	   
	   @FindBy(name = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	   private WebElement MoreLnk;
	 
	   @FindBy(xpath = "//a[@name='Campaigns']")
	   private WebElement cmpLnk;
	   
	   @FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	   private WebElement ProductIcn;
	   
	   @FindBy(xpath = "//input[@id='search_txt']")
	   private WebElement srhproductTxt;
	   
	   @FindBy(xpath = "//input[@class='crmbutton small create']")
	   private WebElement srhBtn;
	   
	   @FindBy(xpath = "//a[@id='1']")
	   private WebElement select;
	   
	   @FindBy(xpath = "//input[@class='crmButton small save']")
	   private WebElement svnBtn;
	   
	   
	   
	   public CreatecompaignPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
        }
	   
	   
	   public void ClickOnCompaignIcon()
	   {
		   cmpIcn.click();
	   }

	   public void CreateCompaign(WebDriver driver, String Value)
	   {
		   
		   CpgNameTxt.sendKeys(Value);
		  
	   }
	   
	   public void Save()
	   {
		   svBtn.click();
	   }
	   
	  
	   public void Createcompainwithproduct()
	   
	   {
		   cmpIcn.click();
		 
		   
	   }
	   public void ClickOnProductIcon()
	   {
		   ProductIcn.click();  
	   }
	   
	   public void EnterDetailsInProductWindow(WebDriver driver,String productname,  String switchintxt,String switchouttxt )
	   {
		   WebDriverRepository.switchToWindowBasedOntitle(driver, switchintxt);
		   WebDriverRepository.Sleep(3000);

		   srhproductTxt.sendKeys(productname);
		   WebDriverRepository.Sleep(3000);

		   srhBtn.click();
		   WebDriverRepository.Sleep(3000);
		   
		   select.click();
		   WebDriverRepository.Sleep(3000);

		   WebDriverRepository.switchToWindowBasedOntitle(driver, switchouttxt);
		   WebDriverRepository.Sleep(3000);

	   }

}
