package com.vtiger.contactsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtiger.practice.BaseClass;
import com.vtigrer.objectRpositories.Test.CreateContactPage;

public class CreateContactsTest extends BaseClass{


@Test(groups = "sanity")

	public void createContactsTest() throws Throwable {

	  String data = ExlLibrary.getExcelfile("Sheet1", 4, 2);
	  
	WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");

		CreateContactPage createcontactpage=new CreateContactPage(driver);
		createcontactpage.ClickOnContactLink();
		createcontactpage.clickonContactIcon();
		createcontactpage.CreatedContacts(data+Randomnumber);
		createcontactpage.save();
		WebDriverRepository.ValidationThroughTitle("Contacts", "Contacts", "contact creation is Suceesfull", "Unable to Login");

	
		


		
	}

}
