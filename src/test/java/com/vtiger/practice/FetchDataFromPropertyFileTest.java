package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.sdet34l1.genericInformationStudy.FileStudyRoom;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.JavacodeLibrary;

public class FetchDataFromPropertyFileTest {
	

	public static void main(String[] args) throws IOException {
		JavacodeLibrary jclibrary=new JavacodeLibrary();
FileStudyRoom.FetchDataFromPropertyFile(IconstantPathtInformation.PROPERTYFILEPATH);
		
		String url = FileStudyRoom.FetchDataFromPropertyFile("url");
		String username =FileStudyRoom.FetchDataFromPropertyFile("username");
		String password = FileStudyRoom.FetchDataFromPropertyFile("password");
		String timeout = FileStudyRoom.FetchDataFromPropertyFile("timeout");
		String browser = FileStudyRoom.FetchDataFromPropertyFile("browser");
		
		long longtimeout = jclibrary.StringToLong(timeout);
			WebDriver driver=null;
		

	
	System.out.println(url);
	System.out.println(username);
    System.out.println(password);
	System.out.println(timeout);
     System.out.println(browser);

		
		
		
		
		
	}

}
