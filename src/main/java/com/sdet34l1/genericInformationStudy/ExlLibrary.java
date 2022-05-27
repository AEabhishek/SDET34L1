package com.sdet34l1.genericInformationStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this method is used to get the data from the excel
 * @author Abhi Akshay
 *
 */

public class ExlLibrary {
	
	
	static Workbook wb;
	public static void openExcel(String excelfilepath) throws EncryptedDocumentException, IOException
	{
		
FileInputStream fis =new FileInputStream(excelfilepath);
		
		wb=WorkbookFactory.create(fis);
		
	}
	/**
	 * this method is used to fetch the data from excel sheet
	 * 
	 * @param excelfilepath
	 * @param SheetName
	 * @param rownumber
	 * @param cellnumber
	 * @return 
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException
	 */
	 
	public static String getExcelfile(String SheetName,int rownumber,int cellnumber) throws IOException 
	{
		
		  String data = wb.getSheet(SheetName).getRow(rownumber).getCell(cellnumber).toString();
		return data;
			
	}
	
	/**
	 * this method is used to write the data into excel
	 * @param SheetName
	 * @param rownumber
	 * @param cellnumber
	 * @param Value
	 * @throws IOException
	 */
	 
	public static void setExcelfile(String SheetName,int rownumber,int cellnumber,String Value) throws IOException 
	{
		wb.getSheet(SheetName).getRow(rownumber).createCell(cellnumber).setCellValue(Value);
		wb.getSheet(SheetName).getRow(rownumber).createCell(cellnumber).setCellValue(Value);
		
	}
	/**
	 * this method is used to execute writing data into excel
	 * @param filepath
	 * @throws IOException 
	 */
	
	public static void WriteExcel(String filepath) throws IOException
	{
			FileOutputStream fos=new FileOutputStream(filepath);
			
				wb.write(fos);
		
	}
	/**
	 * this method is used to close the workbook
	 */
	
	public static void closeExcel()
	{
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	

}
