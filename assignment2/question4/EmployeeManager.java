package com.assignment2.question4;

import java.util.*;
import java.util.regex.Pattern;

public class EmployeeManager implements EmployeeOperations {

	private Map<String, Employee> empMap;

	public EmployeeManager(int choice) {
		if (choice == 1)
			empMap = new HashMap<>();
		else if (choice == 2)
			empMap = new Hashtable<>();
		else
			empMap = new TreeMap<>();
	}

	// REGEX validation for Employee ID (EMP followed by digits)
	public boolean validateEmpId(String empId) {
		return Pattern.matches("EMP[0-9]{3}", empId);
	}

	@Override
	public void addEmployee(Employee e) {
		empMap.put(e.getEmpId(), e);
		System.out.println("Employee added successfully");
	}

	@Override
	public void displayEmployees() {
		if (empMap.isEmpty()) {
			System.out.println("No employee records found");
			return;
		}
		for (Map.Entry<String, Employee> entry : empMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	@Override
	public Employee searchEmployee(String empId) {
		return empMap.get(empId);
	}

	@Override
	public void removeEmployee(String empId) {
		if (empMap.remove(empId) != null)
			System.out.println("Employee removed successfully");
		else
			System.out.println("Employee not found");
	}

	// Demonstrate null key & null value
	public void demonstrateNullSupport() {
		try {
			empMap.put(null, null);
			System.out.println("Null key & value supported in this Map");
		} catch (Exception e) {
			System.out.println("Null key/value NOT supported in this Map");
		}
	}
}
