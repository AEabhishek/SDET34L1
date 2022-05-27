package com.vtiger.organisationTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateOrganisationPage;

public class CreateorganisationTest extends BaseClass {
	@Test

	public void createorganisationTest() throws Throwable {
		
		   String data3 = ExlLibrary.getExcelfile("Sheet1", 4, 1);


		WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");

		CreateOrganisationPage createorganisation=new CreateOrganisationPage(driver);
		createorganisation.ClickOnOrganisationLink();
		createorganisation.ClickOnCreateNewOrganisationIcon();
		createorganisation.organisationCreated(data3+Randomnumber);

		createorganisation.Save();


		WebDriverRepository.ValidationThroughTitle("Accounts", "Accounts", "oraganisation creation is sucessful", "organisation creation is not sucessful");


	}

}
