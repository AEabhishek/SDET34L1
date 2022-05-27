package com.vtiger.contactsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateContactPage;

public class CreateContactythrwOrganisationTest extends BaseClass {
	@Test(groups = "sanity")
	
	public  void createContactythrwOrganisationTest() throws Exception 
	{
		String data2 = ExlLibrary.getExcelfile("sheet1", 4, 4);
		
		WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");
		CreateContactPage createcontactpage=new CreateContactPage(driver);
		createcontactpage.ClickOnContactLink();
		createcontactpage.clickonContactIcon();
		createcontactpage.CreatedContacts(data2+Randomnumber);
		createcontactpage.ClickOnOrganisationIcon();
		createcontactpage.switchtowindow(driver, "Accounts&action", "Contacts&action");
		createcontactpage.save();
		WebDriverRepository.ValidationThroughTitle("Contacts", "Contacts", "contact creation is Suceesfull", "Unable to create");

		
	}

}
