package com.vtiger.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.sdet34l1.genericInformationStudy.ExlLibrary;
import com.sdet34l1.genericInformationStudy.IconstantPathtInformation;

public class excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExlLibrary.openExcel(IconstantPathtInformation.EXCELPATH);
		String r = ExlLibrary.getExcelfile("Sheet1", 10, 4);
		String s = ExlLibrary.getExcelfile("Sheet1", 10, 2);
		System.out.println(r);
		System.out.println(s);
	}

}
