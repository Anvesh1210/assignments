package com.miniproject2.EmployeeManagementSystem;

import java.io.*;
import java.util.*;

public class EmployeeManager implements EmployeeOperations {

	private List<Employee> employees = new ArrayList<>();
	private Set<String> departments = new HashSet<>();
	private static final String FILE = "employees.txt";

	public EmployeeManager() {
		loadFromFile();
	}


	private void loadFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] d = line.split(",");
				Employee e = new Employee(d[0], d[1], d[2], Double.parseDouble(d[3]));
				employees.add(e);
				departments.add(d[2]);
			}
		} catch (Exception e) {
			// File may not exist initially
		}
	}

	private void saveToFile() {
		try (FileWriter fw = new FileWriter(FILE)) {
			for (Employee e : employees) {
				fw.write(e.toFileString() + "\n");
			}
		} catch (IOException e) {
			System.out.println("File write error");
		}
	}

	// ================= VALIDATIONS =================

	private boolean isDuplicateId(String id) {
		return employees.stream().anyMatch(e -> e.getEmpId().equals(id));
	}

	// ================= CRUD OPERATIONS =================

	@Override
	public void addEmployee(Employee e) throws Exception {
		if (isDuplicateId(e.getEmpId()))
			throw new Exception("Employee ID must be unique");

		if (e.getSalary() <= 0)
			throw new Exception("Salary must be positive");

		if (e.getDepartment().isEmpty())
			throw new Exception("Department cannot be empty");

		employees.add(e);
		departments.add(e.getDepartment());
		saveToFile();
		System.out.println("Employee added successfully");
	}

	@Override
	public void displayEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employee records found");
			return;
		}
		employees.forEach(System.out::println);
	}

	@Override
	public Employee searchEmployee(String empId) {
		return employees.stream().filter(e -> e.getEmpId().equals(empId)).findFirst().orElse(null);
	}

	@Override
	public void updateSalary(String empId, double salary) throws Exception {
		if (salary <= 0)
			throw new Exception("Salary must be positive");

		Employee e = searchEmployee(empId);
		if (e == null)
			throw new Exception("Employee not found");

		e.setSalary(salary);
		saveToFile();
		System.out.println("Salary updated successfully");
	}

	@Override
	public void deleteEmployee(String empId) throws Exception {
		Employee e = searchEmployee(empId);
		if (e == null)
			throw new Exception("Employee not found");

		employees.remove(e);
		saveToFile();
		System.out.println("Employee deleted successfully");
	}

	@Override
	public void displaySortedEmployees() {
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
	}

	@Override
	public void displayDepartments() {
		System.out.println("Departments:");
		departments.forEach(System.out::println);
	}
}
