package com.vtiger.organisationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtiger.practice.BaseClass;
import com.vtigrer.objectRpositories.Test.CreateContactPage;
import com.vtigrer.objectRpositories.Test.CreateOrganisationPage;

public class CreateorganisationThrwdropdown extends BaseClass {
	@Test


	public void createorganisationThrwdropdown()throws EncryptedDocumentException, IOException, Exception 
	{
		String data2 = ExlLibrary.getExcelfile("sheet1", 4, 4);
		
		WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");

	CreateOrganisationPage createorgPage=new CreateOrganisationPage(driver);
	createorgPage.ClickOnOrganisationLink();
	createorgPage.ClickOnCreateNewOrganisationIcon();
	createorgPage.organisationCreated(data2+Randomnumber);
	createorgPage.handleIndustryDropDown();
	createorgPage.handleTypeDropDown();
	createorgPage.Save();
		
	WebDriverRepository.ValidationThroughTitle("DetailView&module", "DetailView&module", "Organisation is created", "Organisation is created");
	


	}
}
