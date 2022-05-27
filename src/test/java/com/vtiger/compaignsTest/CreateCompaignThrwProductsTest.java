package com.vtiger.compaignsTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.vtigrer.objectRpositories.Test.CreateProductHomePage;
import com.vtigrer.objectRpositories.Test.CreatecompaignPage;

public class CreateCompaignThrwProductsTest extends BaseClass {
	
	@Test(groups = "sanity")
	
	public void createCompaignThrwProductsTest() throws IOException
	{
		
		String ProductName = ExlLibrary.getExcelfile("Sheet1", 10, 0);
		
		   String IdInCompaign = ExlLibrary.getExcelfile("Sheet1", 10, 1);
		  String IdoutCompaign = ExlLibrary.getExcelfile("Sheet1", 10, 2);
		  String data = ExlLibrary.getExcelfile("Sheet1", 4, 2);
		
		   String data3 = ExlLibrary.getExcelfile("Sheet1", 4, 1);

		
		CreateProductHomePage createcontact=new CreateProductHomePage(driver);
		createcontact.CreatedHomePage();
		createcontact.EnterProductPage();
		createcontact.SaveProductPage(ProductName);
		
		homepage.ClickCompaignAction(driver);
		CreatecompaignPage createcompaignpage=new CreatecompaignPage(driver);
		createcompaignpage.ClickOnCompaignIcon();
		createcompaignpage.CreateCompaign(driver, data3+Randomnumber);
		createcompaignpage.ClickOnProductIcon();
		createcompaignpage.EnterDetailsInProductWindow(driver, ProductName, IdInCompaign, IdoutCompaign);
		createcompaignpage.Save();
	
	}

}
