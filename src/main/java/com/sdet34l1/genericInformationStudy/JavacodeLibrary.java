package com.sdet34l1.genericInformationStudy;

import java.util.Random;

/**
 * This contains only specific reusable methods
 * @author Abhi Akshay
 *
 */

public class JavacodeLibrary {
	
	/**
	 * This method converts string value to long datatype
	 * @param value
	 * @return
	 */
	
	public static long StringToLong(String value)
	
	{
		return Long.parseLong(value);
	}
	/**
	 * This method used to get the random number
	 * @param limit
	 * @return
	 */
	public static int getRandomNunmber(int limit)
	{
		Random ran=new Random();
		return ran.nextInt(limit);
	}
	

}
