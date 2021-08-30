package com.apachePoi.readOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadFromExcel {

	public void read() throws IOException {
		
		String filepath = ".//src//main//resources//static//Employee.xlsx";
		
		FileInputStream input = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows= sheet.getLastRowNum();
		int cols= sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING : System.out.println(cell.getStringCellValue());
				
				}
				
			}
			System.out.println();
		}
		
	}
}
