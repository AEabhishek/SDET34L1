package com.vtiger.practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver2;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String f = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ssss").format(new Date());
		System.out.println(f);
		File dst = new File("./photos/" +"_"+f+".png");
		System.out.println(dst.getAbsolutePath());
		FileUtils.copyFile(src, dst);		
	}

}
