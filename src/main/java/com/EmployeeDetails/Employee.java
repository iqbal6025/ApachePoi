package com.EmployeeDetails;



public class Employee {

	  private String Name;
	  private String EmpId;
	  private double Salary;
	  private String email;
	  private String Address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Employee(String name, String empId, double salary, String email, String address) {
		super();
		Name = name;
		EmpId = empId;
		Salary = salary;
		this.email = email;
		Address = address;
	}
          
	  
	  
     
	  
	  
}
