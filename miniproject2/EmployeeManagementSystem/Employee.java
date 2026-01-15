package com.miniproject2.EmployeeManagementSystem;

public class Employee {
	private String empId;
	private String name;
	private String department;
	private double salary;

	public Employee(String empId, String name, String department, double salary) {
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Convert object to file format
	public String toFileString() {
		return empId + "," + name + "," + department + "," + salary;
	}

	@Override
	public String toString() {
		return "ID: " + empId + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
	}
}
