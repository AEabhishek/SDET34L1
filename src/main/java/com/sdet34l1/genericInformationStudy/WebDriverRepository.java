package com.sdet34l1.genericInformationStudy;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * this is class is used to maintain all WebDriver common actions
 * @author Abhi Akshay
 *
 */

public class WebDriverRepository {
	static WebDriver driver;
	
	public WebDriverRepository(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * this method used to navigate to the application
	 * @param url
	 * @param driver
	 */
	
	public static void navigateApp(String url,WebDriver driver) {
		driver.get(url);
	}
	
	/**
	 * to maximize the browser
	 */
	public static void maximzBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method is used to initialize and launchBrowser(String browser)
	 * @param browser
	 * @return 
	 */
	public static void launchbrowser(String browser,WebDriver driver)
	{
		switch (browser)
		{
		case "Chrome":
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
	
	}
	/**
	 * this method is used to return driver instance
	 * @param driver
	 * @return
	 */
	public static WebDriver getDriver(WebDriver driver)
	{
		return driver;
	}
	
	/**
	 * this is used to implicitly wait till page load
	 * @param timeout
	 * @param driver
	 */
	public static void waitTillPageLoad(long timeout, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	/**
	 * this method is used to mouse hover action on the element
	 * @param morelink
	 * @param driver
	 */
	
	public static void mouseHoverOnTheElement(WebElement morelink, WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(morelink).perform();

	}
	
	
	public static void Sleep(long value)
	{
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	/**
	 * this method is used to close the browser instance
	 * @param driver
	 */
	
	public static void quitbrowser(WebDriver driver)
	{
		driver.quit();
	}
	/**
	 * this method is used to switch from window
	 * @param driver
	 * @param partialText
	 */
	
	
	public static void switchToWindowBasedOntitle(WebDriver driver, String partialText)
	{
		Set<String> sessionIDs = driver.getWindowHandles();
		for(String id:sessionIDs)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(partialText))
			{
				break;
			}
		}
		
	}
	
	/**
	 * this method is used to HandleDropDown by value
	 * @param element
	 * @param Value
	 */
	
	public static void HandleDropDown(WebElement element,String Value)
	{
		
		Select st=new Select(element);
		st.selectByValue(Value);
	}
	
	/**
	 * this method is used to HandleDropDown by index
	 * @param element
	 * @param index
	 */
	public static void HandleDropDown(WebElement element,int index)
	{
		
		Select st=new Select(element);
		st.selectByIndex(index);
	}
	
	/**
	 * this method used to HandleDropDown by visibleText
	 * @param visibleText
	 * @param element
	 */
	
	
	
	public static void HandleDropDown(String visibleText,WebElement element)
	{
		
		Select st=new Select(element);
		st.selectByVisibleText(visibleText);
	}
	
	/**
	 * this method used to switch to frames by name or id
	 * @param driver
	 * @param nameOrid
	 */
	
	public static void switchToFrames(WebDriver driver,String nameOrid)
	{
		driver.switchTo().frame(nameOrid);
	}
	
	
	
	
	
	
	public static void switchToFrames(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	
	
	
	
	/**
	 * this method used to switch to frames by index
	 * @param driver
	 * @param index
	 */
	
	
	public static void switchToFrames(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * this method used to switch from frame to default page
	 * @param driver
	 */
	
	public static void switchBack(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	
	/**
	 * This is used to for customized time for browser speed
	 * @param element
	 * @param pollingTime
	 * @param duration
	 */
	public static void customWait(WebElement element, long pollingTime, int duration)
	{
		int count=0;
		while(count<=duration)
		{
			try {
				element.click();
				break;
			}
			catch(Exception e)
			{
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				count++;
			}
		}
	}
	
	
	
	
	/**
	 * this method is used to print the statement
	 * @param message
	 */
	
	public static void print(String message)
	{
		System.out.println(message);
	}
	
	
	/**
	 * this method is used to validate the condition
	 * @param actualResult
	 * @param expectedResult
	 * @param testCaseName
	 */
	public static void assertionTthroughIfCondition(String actualResult, String expectedResult,String testCaseName)
	{
		if(actualResult.equalsIgnoreCase(expectedResult))
		{
			System.out.println(testCaseName+"Created Sucessfully");
			System.out.println("TC Pass");
		}
	}
	
	/**
	 * this method is used to validate throught tittle
	 * @param ActualValue
	 * @param expected
	 * @param ifValue
	 * @param elseValue
	 */
	
	public static void ValidationThroughTitle(String ActualValue,String expected,String ifValue,String elseValue)
	{
		if(expected.contains(ActualValue))
		{
			System.out.println(ifValue);
		}
		else
		{
			System.out.println(elseValue);
		}
		
		
		
		
	}
	public static void validationforExcel(WebDriver driver, String Result, String message)
	{
		if(driver.getTitle().contains(Result));
		WebDriverRepository.print(message);
		
	}

	public String takeScreenShot(String methodName, BaseClass cast) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


}
