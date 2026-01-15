package com.miniproject2.EmployeeManagementSystem;

public interface EmployeeOperations {
	void addEmployee(Employee e) throws Exception;
    void displayEmployees();
    Employee searchEmployee(String empId);
    void updateSalary(String empId, double salary) throws Exception;
    void deleteEmployee(String empId) throws Exception;
    void displaySortedEmployees();
    void displayDepartments();
}
