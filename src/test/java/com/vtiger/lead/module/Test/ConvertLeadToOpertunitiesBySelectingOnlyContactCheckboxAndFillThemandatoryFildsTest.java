package com.vtiger.lead.module.Test;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateLeadPage;
import com.vtigrer.objectRpositories.Test.HomePage;
import com.vtigrer.objectRpositories.Test.LoginPage;

public class ConvertLeadToOpertunitiesBySelectingOnlyContactCheckboxAndFillThemandatoryFildsTest extends BaseClass {
	@Test
	
	public static void ConvertLeadToOpertunitiesByAllTheCheckboxAndExpectedShouldBeGivenAsPerTCTest() throws Throwable {
		
			
	       String r = ExlLibrary.getExcelfile("Sheet1", 4, 4);
			
			String s = ExlLibrary.getExcelfile("Sheet1", 5, 4);
			LoginPage login=new LoginPage(driver);
			HomePage hope=new HomePage(driver);
			CreateLeadPage cl=new CreateLeadPage(driver);
		
			WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is displayed", "elsenot");
			
			ExlLibrary.openExcel(IconstantPathtInformation.WRITEEXCELPATH);
			ExlLibrary.setExcelfile("Sheet1", 7, 1, "HomePage is dispalyed");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		
			cl.leadCreated(r, s);
			
			ExlLibrary.setExcelfile("Sheet1", 8, 1, "Lead is Created");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		
			cl.CvrtLdwithoutorg();
		
			
			ExlLibrary.setExcelfile("Sheet1", 9, 1, "Conversion of lead Sucessfull");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			WebDriverRepository.ValidationThroughTitle("Users", "Users", "logged out sucessfully", "elsenot");
			
			ExlLibrary.setExcelfile("Sheet1", 10, 1, "logged out sucessfully");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		
			
			
		
	}

}
