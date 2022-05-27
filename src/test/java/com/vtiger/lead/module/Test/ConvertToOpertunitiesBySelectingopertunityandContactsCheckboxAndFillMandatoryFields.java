package com.vtiger.lead.module.Test;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateLeadPage;
import com.vtigrer.objectRpositories.Test.HomePage;
import com.vtigrer.objectRpositories.Test.LoginPage;

public class ConvertToOpertunitiesBySelectingopertunityandContactsCheckboxAndFillMandatoryFields extends BaseClass {
	@Test
	
	
	public static void ConvertToOpertunitiesBySelectingopertunityandContactsCheckboxAndFillMandatoryFields() throws Throwable {
		
	        String r = ExlLibrary.getExcelfile("Sheet1", 4, 4);
			
			String s = ExlLibrary.getExcelfile("Sheet1", 5, 4);
			
			LoginPage login=new LoginPage(driver);
			HomePage hope=new HomePage(driver);
			CreateLeadPage cl=new CreateLeadPage(driver);
			
	        login.loginAction(username, username);
			WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is displayed", "elsenot");
			
	        ExlLibrary.openExcel(IconstantPathtInformation.WRITEEXCELPATH);
				ExlLibrary.setExcelfile("Sheet1", 25, 1, "Home is displaying");	
			    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
		        cl.leadCreated(r, s);
			
				ExlLibrary.setExcelfile("Sheet1", 26, 1, "Home is displaying");	
			    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			      cl.convertLead("2016-10-16");
		
			
				ExlLibrary.setExcelfile("Sheet1", 27, 1, "Home is displaying");	
			    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			
	            hope.SignOut(driver);
			WebDriverRepository.ValidationThroughTitle("Users", "Users", "logged out sucessfully", "elsenot");
			
				ExlLibrary.setExcelfile("Sheet1", 28, 1, "Home is displaying");	
			    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			
			WebDriverRepository.quitbrowser(driver);
			
			
		
	}

}
