package com.sdet34l1.genericInformationStudy;

import java.io.IOException;
/**
 * this is used to perform common action
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtigrer.objectRpositories.Test.HomePage;
import com.vtigrer.objectRpositories.Test.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public JavacodeLibrary jclibrary;
	public String password;
	public static String username;
	public String browser;
	public static   int Randomnumber;
	public static long timeout;
	
	/**
	 * this method is used to open the excel,property file,connect to the Database
	 * @throws IOException
	 */
	@BeforeSuite(groups = "baseClass")
	public void BeforeSuiteTest() throws IOException
	{
		FileStudyRoom.openpropertyFile(IconstantPathtInformation.PROPERTYFILEPATH);
		ExlLibrary.openExcel(IconstantPathtInformation.EXCELPATH);

		
	}
	/**
	 * this method is used to perform normal execution configuration(launch the browser,navigate to app,browser setting,implicit wait,instance of pom)
	 * @throws IOException
	 */
	//@Parameters("browser")
	@BeforeClass(groups = "baseClass")
	public void BeforeClass() throws IOException
	{
		String url = FileStudyRoom.FetchDataFromPropertyFile("url");
	
		username=  FileStudyRoom.FetchDataFromPropertyFile("username");
		browser = FileStudyRoom.FetchDataFromPropertyFile("browser");
	
		password = FileStudyRoom.FetchDataFromPropertyFile("password");
	

		//username = ExlLibrary.getExcelfile("Sheet1", 4, 3);
		   
		   Randomnumber = JavacodeLibrary.getRandomNunmber(10000);
		  

		
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

		WebDriverRepository.navigateApp(url, driver);
		WebDriverRepository.maximzBrowser(driver);
		
	}
	/**
	 * this method is used to perform login action
	 */
	
	
	@BeforeMethod(groups = "baseClass")
	public void Beforemethod()
	{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		loginpage.loginAction(username, password);
		//WebDriverRepository.waitTillPageLoad(timeout, driver);
	}
	/**
	 * this method is used to close the browser,logout from the app
	 */
	@AfterMethod(groups = "baseClass")
	
	public void AfterMethod()
	{
		homepage.SignOut(driver);
	}
	
	/**
	 * this class is used to close the browser
	 */
	@AfterClass(groups = "baseClass")
	public void AfterClass()
	{
		  
		WebDriverRepository.quitbrowser(driver);
		
	}
	/**
	 * this Annotation is used to close property file,database,excel
	 */
	
	
	@AfterSuite(groups = "baseClass")
	public void AfterSuite()
	{
		ExlLibrary.closeExcel();
	}
	
	
	
}
