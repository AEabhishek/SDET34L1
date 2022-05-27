package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreateProductHomePage {
	
	@FindBy(linkText = "Products")
	private WebElement pdtLnk;
	
	
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement cpIcn;
	
	@FindBy(name = "productname")
	private WebElement pdtNme;
	
	@FindBy(name = "button")
	private WebElement svBtn;

	
	public CreateProductHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CreatedHomePage()
	{
		pdtLnk.click();
	
	}
	public void EnterProductPage()
	{
		cpIcn.click();
	}
	
	
	public void  SaveProductPage(String value)
	{
		pdtNme.sendKeys(value);
		svBtn.click();
		WebDriverRepository.Sleep(6000);
	}
	


}
