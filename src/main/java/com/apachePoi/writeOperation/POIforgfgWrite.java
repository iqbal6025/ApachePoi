package com.apachePoi.writeOperation;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.EmployeeDetails.Employee;

//import statements

public class POIforgfgWrite {

	public void writeOperation() {
		// Blank workbook

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Employee Details");

		HashMap<String, Employee> map = new HashMap();

		// Create Employees objects
		Employee e1 = new Employee("Iqbal", "62255", 200000, "mdiqbal.hussain@zensar.com", "Jharkhand");
		Employee e2 = new Employee("Mandar", "62266", 234000, "mandar@zensar.com", "MP");
		Employee e3 = new Employee("Vaishali", "80000", 890000, "Vaishali@zensar.com", "Banglore");
		Employee e4 = new Employee("Rohan", "80001", 890000, "Rohan@zensar.com", "Banglore");

		// Store objects in HashMap
		map.put("Iqbal", e1);
		map.put("Mandar", e2);
		map.put("Vaishali", e3);
		map.put("Rohan", e4);

		// create object array for heading
		Object[] heading = new Object[] { "Name", "Emp_ID", "Salary", "Email", "Address" };

		// Set heading
		Row headrow = sheet.createRow(0);
		int headcell = 0;
		
		for (Object head : heading) {
            
			Cell cell = headrow.createCell(headcell++);
			CellStyle style=null;
			XSSFFont font= workbook.createFont();
			font.setBold(true);
			style=workbook.createCellStyle();;
	        
	        // Setting font to style
	        style.setFont(font);
			style.setFont(font);
			cell.setCellStyle(style);
		
            
			if (head instanceof String)
				cell.setCellValue((String) head);

		}

		// Iterate over data and write to sheet
		Set<String> keyset = map.keySet();

		int rownum = 1;
		for (String key : keyset) {
			// this creates a new row in the sheet
			Row row = sheet.createRow(rownum++);
			Employee objArr = map.get(key);
			int cellnum = 0;
			for (int i = 0; i < 5; i++) {

				Cell cell = row.createCell(cellnum++);
				if (cellnum == 1) {
					cell.setCellValue(objArr.getName());
				} else if (cellnum == 2) {
					cell.setCellValue(objArr.getEmpId());
				} else if (cellnum == 3) {
					cell.setCellValue(objArr.getSalary());
				} else if (cellnum == 4) {
					sheet.setColumnWidth(3, 6000);
					cell.setCellValue(objArr.getEmail());
					
					
				} else {
					cell.setCellValue(objArr.getAddress());
				}

			}
		}

		try {
			// this Writes the workbook gfgcontribute
			FileOutputStream out = new FileOutputStream(new File(".//src//main//resources//static//Employee.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("gfgcontribute.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
