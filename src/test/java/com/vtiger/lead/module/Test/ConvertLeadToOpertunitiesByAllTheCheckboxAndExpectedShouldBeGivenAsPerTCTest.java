package com.vtiger.lead.module.Test;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateLeadPage;



public class ConvertLeadToOpertunitiesByAllTheCheckboxAndExpectedShouldBeGivenAsPerTCTest extends BaseClass {
	@Test
	
	public static void ConvertLeadToOpertunitiesByAllTheCheckboxAndExpectedShouldBeGivenAsPerTCTest() throws Throwable {
		
			
			
			
			String r = ExlLibrary.getExcelfile("Sheet1", 4, 4);
			
			String s = ExlLibrary.getExcelfile("Sheet1", 5, 4);
			
			String ClosingDate = ExlLibrary.getExcelfile("Sheet1", 10, 4);
			
			
			CreateLeadPage createleadpage=new CreateLeadPage(driver);
			
			ExlLibrary.openExcel(IconstantPathtInformation.WRITEEXCELPATH);
			ExlLibrary.setExcelfile("Sheet1", 0, 1, "HomePage is dispalyed");
			ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			
			
			WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is displayed", "elsenot");
			
			createleadpage.leadCreated(r, s);
			
			ExlLibrary.setExcelfile("Sheet1", 1, 1, "Lead is Created");
			ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			createleadpage.convertLead(ClosingDate);
			

			WebDriverRepository.ValidationThroughTitle("Marketing", "Marketing", "conversion of lead Suceessful", "elsenot");
			
			ExlLibrary.setExcelfile("Sheet1", 2, 1, "Conversion of lead Sucessfull");
			ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			WebDriverRepository.ValidationThroughTitle("Users", "Users", "logged out sucessfully", "elsenot");
			
			ExlLibrary.setExcelfile("Sheet1", 3, 1, "logged out sucessfully");
			ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		
		
	}
}
