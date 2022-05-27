package com.vtiger.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sdet34l1.genericInformationStudy.WebDriverRepository;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganisationwithallfieldsTest 
{
	public static void main(String[] args) throws Exception 
	{
	FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		
		Properties property = new Properties();
		
		property.load(fis);
		
	String url = property.getProperty("url");
	String username = property.getProperty("username");
	String password = property.getProperty("password");
	String timeout = property.getProperty("timeout");
	String browser = property.getProperty("browser");
	
	long longtimeout = Long.parseLong(timeout);
	WebDriver driver=null;
	
	switch(browser)
	{
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	break;
	default:
	System.out.println("please specify your browser key");
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	break;
	}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
	
		FileInputStream fis4=new FileInputStream("./src/test/resources/excel/data3.xlsx");
		Workbook wb = WorkbookFactory.create(fis4);
		Sheet s = wb.getSheet("sheet1");
		
		  Row r2 = s.getRow(4);
			
			Cell c2 = r2.getCell(3);
			
			String data2 = c2.getStringCellValue();
		
	
		
		Row r = s.getRow(4);
		
		Cell c = r.getCell(1);
		Random ran = new Random();
		int random = ran.nextInt(1000);
		String data = c.getStringCellValue();
		
       
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(data+random);
		
	
		Thread.sleep(4000);	
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='industry']"));
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		
		
	    WebDriverRepository.HandleDropDown(drop1, "Engineering");
	    
	    WebDriverRepository.HandleDropDown(drop2, "Partner");
		

		
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act2=new Actions(driver); 	
		act2.moveToElement(ele).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		
	}
	}

