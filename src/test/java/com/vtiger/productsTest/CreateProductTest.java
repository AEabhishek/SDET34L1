package com.vtiger.productsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtiger.practice.BaseClass;
import com.vtigrer.objectRpositories.Test.CreateProductHomePage;






public class CreateProductTest extends BaseClass {
	
@Test(groups = "sanity")

	public void createProductTest() throws Exception {
	
	String data2 = ExlLibrary.getExcelfile("sheet1", 4, 4);

    
	WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");

	
	CreateProductHomePage productpage=new CreateProductHomePage(driver);
	productpage.CreatedHomePage();
	productpage.EnterProductPage();
	productpage.SaveProductPage(data2);
	WebDriverRepository.ValidationThroughTitle("Products", "Products", "Products creation is sucessful", "Products creation is not sucessful");

	
	
	}

}
