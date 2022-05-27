package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;

public class TestngAssertTest {
	public void practice1Test()
	{
		Reporter.log("a-practice-1");
		Reporter.log("a-practice-1");
		Reporter.log("a-practice-1");
		Assert.fail();
		Reporter.log("a-practice-1");
		Reporter.log("a-practice-1");
		Reporter.log("a-practice-1");
		Reporter.log("a-practice-1");
	}

}
