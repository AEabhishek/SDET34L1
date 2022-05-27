package com.vtiger.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchtheDataFromExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./src/test/resources/excel/data1.xlsx/");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet s = wb.getSheet("sheet1");
		
		Row r = s.getRow(4);
		
		Cell c = r.getCell(1);
		Random ran = new Random();
		int random = ran.nextInt(1000);
		String data = c.getStringCellValue();
		

        Row r2 = s.getRow(4);
		
		Cell c2 = r2.getCell(3);
		
		String data2 = c2.getStringCellValue();
		
		System.out.println(data2);
		
		
		
		System.out.println(data+random);
	}

}
