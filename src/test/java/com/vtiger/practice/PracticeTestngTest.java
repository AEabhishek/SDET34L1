package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestngTest {
	
	@Test(groups="sanity")
	public void PracticeTestngTest()
	{
		Reporter.log("Hi Reddy",true);
	}
	
	@Test(groups="regression")
	public void PracticeTestngTest2()
	{
		Reporter.log("Hello World",true);
	}
	
	@Test(groups={"sanity","regression"})
	public void PracticeTestngTest3()
	{
		Reporter.log("Hello India",true);
		
		
		
	}
	
	@Test
	public void PracticeTestngTest4()
	{
		Reporter.log("Hello Karnataka",true);
	}
	
	

}
