package com.vtiger.compaignsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtiger.practice.BaseClass;
import com.vtigrer.objectRpositories.Test.CreatecompaignPage;

public class CreateCompaignTest extends BaseClass{
	
@Test(groups = "sanity")
	public void Createcomp() throws IOException {
	
	String data2 = ExlLibrary.getExcelfile("sheet1", 4, 4);
	ExlLibrary.openExcel(IconstantPathtInformation.WRITEEXCELPATH);
	ExlLibrary.setExcelfile("Compaigns", 2, 1, "HomePage is dispalyed");	
    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		homepage.ClickCompaignAction(driver);
			WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");
			CreatecompaignPage createcompaignPage=new CreatecompaignPage(driver);
			createcompaignPage.ClickOnCompaignIcon();
			createcompaignPage.CreateCompaign(driver, data2+Randomnumber);
			createcompaignPage.Save();
			ExlLibrary.setExcelfile("Compaigns", 3, 1, "compaign creation is sucessful");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
			WebDriverRepository.ValidationThroughTitle("Campaigns", "Campaigns", "compaign creation is  sucessful", "not created");
			ExlLibrary.setExcelfile("Compaigns", 4, 1, "Logged Out Sucessfull");	
		    ExlLibrary.WriteExcel(IconstantPathtInformation.WRITEEXCELPATH);
		  
			
			

}		
	}

