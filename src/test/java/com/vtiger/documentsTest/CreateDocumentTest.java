package com.vtiger.documentsTest;

import org.testng.annotations.Test;

import com.sdet34l1.genericInformationStudy.BaseClass;
import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;
import com.sdet34l1.genericInformationStudy.WebDriverRepository;
import com.vtigrer.objectRpositories.Test.CreateDocumentPage;

public class CreateDocumentTest extends BaseClass {
	
	
@Test


	public  void documentEditTest() throws Exception 
	{
	
	   String data3 = ExlLibrary.getExcelfile("Sheet1", 4, 1);
	   String paragraph = ExlLibrary.getExcelfile("Sheet1", 7, 5);
	   String data2 = ExlLibrary.getExcelfile("sheet1", 4, 4);
	
	
	
	WebDriverRepository.ValidationThroughTitle("Home", "Home", "Homepage is Displayed", "Homepage is not dispalyed");

			CreateDocumentPage createdocumentpage=new CreateDocumentPage(driver);
			createdocumentpage.ClickOnDocumentLink();
			createdocumentpage.ClickOnDocumentIcon();
			createdocumentpage.CreatedDocument(data2+Randomnumber);
			createdocumentpage.Framesection(driver, paragraph);
			createdocumentpage.upload(IconstantPathtInformation.UPLOADFILEPATH);
			createdocumentpage.save();
		
			

}
}