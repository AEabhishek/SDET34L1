package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreateLeadPage {

@FindBy(linkText = "Leads")
private WebElement ldLnk;
	
	
@FindBy(xpath = "//img[@title='Create Lead...']")
private WebElement crtLdIcn;;

@FindBy(xpath = "//input[@name='lastname']")
private WebElement lnTxt;

@FindBy(xpath = "//input[@name='company']")
private WebElement cnTxt;

@FindBy(xpath = "//input[@accesskey='S']")
private WebElement svBtn;
	

@FindBy(linkText = "Convert Lead")
private WebElement cvtld;

@FindBy(xpath = "//input[@id='select_potential']")
private WebElement orgCb;



@FindBy(xpath = "//input[@name='closingdate']")
private WebElement closingdate;

@FindBy(xpath = "//input[@class='crmbutton save small' and @type='submit']")
private WebElement sbtBtn;


@FindBy(xpath = "//input[@id='select_account']")
private WebElement ctCb;

@FindBy(xpath = "//input[@id='potentialname']")
private WebElement opportunityName;

@FindBy(xpath = "//input[@id='select_contact']")
private WebElement contactCB;

@FindBy(xpath = "//input[@id='transfertoacc']")
private WebElement transfertoorgRdBtn;

public CreateLeadPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void leadCreated(String lastname, String companyname )
{
	ldLnk.click();
	crtLdIcn.click();
	lnTxt.sendKeys(lastname);
	cnTxt.sendKeys(companyname);
	svBtn.click();
	
}
public void convertLead(String date)
{
	cvtld.click();
	orgCb.click();
	closingdate.sendKeys(date);
	sbtBtn.click();
	
}
public void CvrtLdwithoutorg()
{
	cvtld.click();
	ctCb.click();
	sbtBtn.click();
	
	
}
public void convertleadwithtransfer(String organisationName, String date)
{
	cvtld.click();
	orgCb.click();
	opportunityName.sendKeys(organisationName);
	closingdate.sendKeys(date);
	contactCB.click();
	transfertoorgRdBtn.click();
	sbtBtn.click();
	
	
}


	

}
