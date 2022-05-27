package com.vtiger.lead.module.Test;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateLeadPage;
import com.vtigrer.objectRpositories.Test.HomePage;
import com.vtigrer.objectRpositories.Test.LoginPage;

public class ConvertToLeadBySelectingAllCheckBoxsAndChangeOpertunityNameTest extends BaseClass{
	@Test
	
	public static void ConvertLeadToOpertunitiesByAllTheCheckboxAndExpectedShouldBeGivenAsPerTCTest() throws Throwable {
		
	         String r = ExlLibrary.getExcelfile("Sheet1", 4, 4);
			
			String s = ExlLibrary.getExcelfile("Sheet1", 5, 4);
			
		LoginPage login=new LoginPage(driver);
		HomePage hope=new HomePage(driver);
		CreateLeadPage cl =new CreateLeadPage(driver);
		
		
			WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is displayed", "elsenot");
			
            ExlLibrary.openExcel(IconstantPathtInformation.WRITEEXCELPATH);
			ExlLibrary.setExcelfile("Sheet1", 19, 1, "Home is displaying");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
		    cl.leadCreated(r, s);

			ExlLibrary.setExcelfile("Sheet1", 20, 1, "Lead is Created");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
		    cl.convertLead("2022-05-12");
		
			
			ExlLibrary.setExcelfile("Sheet1", 21, 1, "Conversion of lead Sucessfull");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			
			WebDriverRepository.ValidationThroughTitle("Users", "Users", "logged out sucessfully", "elsenot");

			ExlLibrary.setExcelfile("Sheet1", 22, 1, "logged out sucessfully");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
}
}
