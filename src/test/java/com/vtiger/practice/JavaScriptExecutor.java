package com.vtiger.practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	
	public static class Getdate{
		public static void main(String[] args) {
			Date date=new Date();
			System.out.println(date);
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.location='http://localhost:8888'");
			driver.manage().window().maximize();
			js.executeScript("arguments[0].value=arguments[1]",driver.findElement(By.name("user_name")),"admin");
			js.executeScript("arguments[0].value=arguments[1]",driver.findElement(By.name("user_password")),"admin");
			js.executeScript("arguments[0].click()",driver.findElement(By.id("submitButton")));
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//b[contains(.,'Upcoming Activities')]")));
			
			
		}
		
	}
		
	

}
