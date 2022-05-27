package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngPractice1Test extends TestngBasicConfigAnnotationPracticeTest{
	
	@Test(groups="sanity")
	public void practice1Test()
	{
		Reporter.log("TestngPractice1Test----->Test1",true);
	}
	
	@Test(groups="sanity")
	public void practice2Test()
	{
		Reporter.log("TestngPractice1Test----->Test2",true);
	}
	
	@Test(groups="sanity")
	public void practice3Test()
	{
		Reporter.log("TestngPractice1Test----->Test3",true);
	}

}
