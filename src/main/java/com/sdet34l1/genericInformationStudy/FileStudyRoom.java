package com.sdet34l1.genericInformationStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains on;y property File specific common methods
 * @author Abhi Akshay
 *
 */


public class FileStudyRoom {

	static Properties Property;
	public static void openpropertyFile(String filepath) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Property=new Properties();
		Property.load(fis);
	}
	/**
	 * This method is used to fetch the data from the property File
	 * @param key
	 * @return 
	 * @return
	 * @throws IOException
	 */
	
	//method syntax===>access specifier modifier ReturnType methodname()
	public static String FetchDataFromPropertyFile(String key) throws IOException
	{
		String value=Property.getProperty(key);
		return value;
	}
	

		
	}
	


