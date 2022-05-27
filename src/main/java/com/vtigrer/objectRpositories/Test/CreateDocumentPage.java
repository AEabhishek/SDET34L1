package com.vtigrer.objectRpositories.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

public class CreateDocumentPage {
	
	
	@FindBy(linkText = "Documents")
	private WebElement DocLnk;
	
	@FindBy(xpath = "//img[@title='Create Document...']")
	private WebElement DocIcn;
	
	@FindBy(xpath = "//input[@name='notes_title']")
	private WebElement Docnme;
	
	@FindBy(xpath = "//iframe[@title='Rich text editor, notecontent, press ALT 0 for help.']")
	private WebElement DocFrame;
	
	
	@FindBy(xpath = "//body[@class='cke_show_borders']")
	private WebElement SltAll;
	
	@FindBy(xpath = "//a[@title='Bold']")
	private WebElement BldBtn;
	
	@FindBy(xpath = "//a[@title='Italic']")
	private WebElement ItnBtn;
	
	@FindBy(xpath = "//input[@id='filename_I__']")
	private WebElement upldSp;
	
	@FindBy(xpath = "//b[.='File Information']/../../following-sibling::tr[4]//input[@title='Save [Alt+S]']")
	private WebElement upldBtn;
	
	
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement sveBtn;
	
	
	
	public CreateDocumentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnDocumentLink()
	{
		DocLnk.click();
	}
	
	public void ClickOnDocumentIcon()
	{
		DocIcn.click();
	}
	
	public void CreatedDocument(String value)
	{
		
		
		Docnme.sendKeys(value);
		
	}
	
	public void Framesection(WebDriver driver,String Paragraph)
	{
		
		WebDriverRepository.switchToFrames(driver, DocFrame);
		SltAll.sendKeys(Paragraph);
		SltAll.sendKeys(Keys.CONTROL+"A");
		WebDriverRepository.Sleep(3000);
		WebDriverRepository.switchBack(driver);
		WebDriverRepository.Sleep(3000);
		BldBtn.click();
		WebDriverRepository.Sleep(2000);
		ItnBtn.click();
		WebDriverRepository.Sleep(2000);
		
	}
	public void upload(String filepath)
	{
		upldSp.sendKeys(filepath);
		upldBtn.click();
		WebDriverRepository.Sleep(3000);
	
		
		
	}
	
	public void save()
	{
		sveBtn.click();
	}
	
	

} 




