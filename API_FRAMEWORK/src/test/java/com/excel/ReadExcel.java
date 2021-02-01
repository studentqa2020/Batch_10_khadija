package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static FileInputStream fis;
	static XSSFWorkbook wb;
	public static void main(String[] args)  {

		File filepath = new File("./Data Folder/Test Data Financial.xlsx");
		try {
			 fis =new FileInputStream(filepath);//data >>>stream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Apache POI >> JAR to handle excel >>> read the excel data as stream

		try {
			 wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		XSSFCell cellValue =wb.getSheetAt(0).getRow(0).getCell(1);
		System.out.println(cellValue.toString());
	}	
	}