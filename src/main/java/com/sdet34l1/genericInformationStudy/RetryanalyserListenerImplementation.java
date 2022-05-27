package com.sdet34l1.genericInformationStudy;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryanalyserListenerImplementation implements IAnnotationTransformer
{
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
			java.lang.reflect.Method testMethod) 
	{
		annotation.setRetryAnalyzer(com.sdet34l1.genericInformationStudy.RetryAnalyserImpementation.class);	
	}
}