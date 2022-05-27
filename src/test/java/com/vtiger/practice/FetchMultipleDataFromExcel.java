package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;

public class FetchMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		{
			FileInputStream fis=new FileInputStream(IconstantPathtInformation.EXCELPATH);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet2");
			String[][] str=new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
			
			for(int i=0; i<=sh.getLastRowNum(); i++)
			{
			for(int j=0; j<sh.getRow(i).getLastCellNum(); j++)
			{
			str[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			Reporter.log(str[i][j],true);
			}
			}
			

			}
		
		
	}

}
	

		
