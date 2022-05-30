package com.vtiger.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.FileStudyRoom;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.JavacodeLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateContactPage;
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
	public CreateContactPage cct;
	public static String data2;
	public static   int Randomnumber;
	public String data;
	public long timeout;



	@BeforeSuite(groups = "baseClass")
	public void BeforeSuiteTest() throws IOException
	{
		JavacodeLibrary JavacodeLibrary=new JavacodeLibrary();
		FileStudyRoom.openpropertyFile(IconstantPathtInformation.PROPERTYFILEPATH);
		ExlLibrary.openExcel(IconstantPathtInformation.EXCELPATH);



	}
 //this is my commit
	//@Parameters("browser")
	@BeforeClass(groups = "baseClass")
	public void BeforeClass() throws IOException
	{
		String url = FileStudyRoom.FetchDataFromPropertyFile("url");
		username=  FileStudyRoom.FetchDataFromPropertyFile("username");
		password = FileStudyRoom.FetchDataFromPropertyFile("password");
		browser = FileStudyRoom.FetchDataFromPropertyFile("browser");
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



	@BeforeMethod(groups = "baseClass")
	public void Beforemethod()
	{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		loginpage.loginAction(username, password);
	}

	@AfterMethod(groups = "baseClass")

	public void AfterMethod()
	{
		homepage.SignOut(driver);
	}
	@AfterClass(groups = "baseClass")
	public void AfterClass()
	{

		WebDriverRepository.quitbrowser(driver);

	}


	@AfterSuite(groups = "baseClass")
	public void AfterSuite()
	{
		ExlLibrary.closeExcel();
	}



}
