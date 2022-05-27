package com.vtiger.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sdet34l1.genericInformationStudy.FileStudyRoom;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.JavacodeLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatecontactTest {
	

	public static void main(String[] args) throws IOException, Throwable {
		JavacodeLibrary jclibrary=new JavacodeLibrary();
		FileStudyRoom.openpropertyFile(IconstantPathtInformation.PROPERTYFILEPATH);
		
		
		String url = FileStudyRoom.FetchDataFromPropertyFile("url");
		String username =FileStudyRoom.FetchDataFromPropertyFile("username");
		String password = FileStudyRoom.FetchDataFromPropertyFile("password");
		String timeout = FileStudyRoom.FetchDataFromPropertyFile("timeout");
		String browser = FileStudyRoom.FetchDataFromPropertyFile("browser");
		
		
		long longtimeout = jclibrary.StringToLong(timeout);
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
	
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("aronchupa");
	driver.findElement(By.name("lastname")).sendKeys("sisnora");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	String t = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(t.contains("aronchupa"))
	{
		System.out.println("TC is passed");
	}
	else
		System.out.println("TC is failed");
	
	
	WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
