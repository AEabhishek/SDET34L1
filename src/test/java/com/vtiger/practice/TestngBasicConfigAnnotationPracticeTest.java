package com.vtiger.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestngBasicConfigAnnotationPracticeTest {
@BeforeSuite(groups="sanity,regression")
public void beforesuiteTest()
{
	Reporter.log("BeforeSuite1"+Thread.currentThread().getId(),true);
}
@AfterMethod

public void AfterSuiteTest()
{
	Reporter.log("AfterSuite1"+Thread.currentThread().getId(),true);
}

@BeforeClass(groups="sanity,regression")
public void BeforeClass1Test()
{
	Reporter.log("BeforeClass1"+Thread.currentThread().getId(),true);
}
@AfterClass
public void AfterClass1Test()
{
	Reporter.log("AfterClass1"+Thread.currentThread().getId(),true);
}

@BeforeTest
public void BeforeTest1Test()
{
	Reporter.log("BeforeTest1",true);
}

@AfterTest
public void AfterTest1Test()
{
	Reporter.log("AfterTest1",true);
}

@BeforeMethod
public void BeforeMethod1Test()
{
	Reporter.log("BeforeMethod1",true);
}

@BeforeMethod
public void BeforeMethod2Test()
{
	Reporter.log("BeforeMethod2",true);
}

@AfterMethod
public void AfterMethodTest()
{
	Reporter.log("AfterMethod",true);
}
}
