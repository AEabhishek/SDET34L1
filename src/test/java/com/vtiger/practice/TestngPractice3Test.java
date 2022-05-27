package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngPractice3Test extends TestngBasicConfigAnnotationPracticeTest {
	
	@Test
	
	public void practice1Test()
	{
		Reporter.log("TestngPractice2Test----->Test1",true);
	}
	@Test
	
	public void practice2Test()
	{
		Reporter.log("TestngPractice2Test----->Test2",true);
	}
	@Test
	public void practice3Test()
	{
		Reporter.log("TestngPractice2Test----->Test3",true);
	}

}
