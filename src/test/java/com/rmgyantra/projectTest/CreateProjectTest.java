package com.rmgyantra.projectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sdet34l1.genericInformationStudy.FileStudyRoom;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.JavacodeLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProjectTest {

	public static void main(String[] args) throws Throwable {
		
		JavacodeLibrary jclibrary=new JavacodeLibrary();
		FileStudyRoom.openpropertyFile(IconstantPathtInformation.PROPERTYFILEPATH);
		
		
		String url = FileStudyRoom.FetchDataFromPropertyFile("url");
		String username =FileStudyRoom.FetchDataFromPropertyFile("username");
		String password = FileStudyRoom.FetchDataFromPropertyFile("password");
		String timeout = FileStudyRoom.FetchDataFromPropertyFile("timeout");
		String browser = FileStudyRoom.FetchDataFromPropertyFile("browser");
		
		
		long longtimeout = jclibrary.StringToLong(timeout);
			WebDriver driver1=null;
	
	
	switch(browser)
	{
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver1=new ChromeDriver();
	break;
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver1=new FirefoxDriver();
	break;
	default:
	System.out.println("please specify your browser key");
	WebDriverManager.firefoxdriver().setup();
	driver1=new FirefoxDriver();
	break;
	}
	driver1.get(url);
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);

		
		driver1.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver1.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver1.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block text-uppercase']")).click();
		driver1.findElement(By.xpath("//a[.='Projects']")).click();
		driver1.findElement(By.xpath("//span[.='Create Project']")).click();
		driver1.findElement(By.xpath("//input[@name='projectName']")).sendKeys("tyss");
		driver1.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("ashok");
	   
	WebElement ele=driver1.findElement(By.xpath("(//select[@name='status'])[2]"));
		Select s=new Select(ele);
		s.selectByVisibleText("On Goging");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();


		
		

		

		
		
	}

}
