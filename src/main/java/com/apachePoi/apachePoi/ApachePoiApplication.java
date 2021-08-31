package com.apachePoi.apachePoi;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.EmployeeDetails.Employee;
import com.apachePoi.readOperation.ReadFromExcel;
import com.apachePoi.writeOperation.POIforgfgWrite;

@SpringBootApplication
public class ApachePoiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApachePoiApplication.class, args);
		
		
		POIforgfgWrite r = new  POIforgfgWrite();
		r.writeOperation();
		
		ReadFromExcel rr = new ReadFromExcel();
		rr.read();
		
	}

}
