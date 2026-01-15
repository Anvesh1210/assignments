package com.miniproject2.EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {

		if (!LoginService.login()) {
			System.out.println("Invalid Login");
			return;
		}

		EmployeeManager manager = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- EMPLOYEE MANAGEMENT MENU ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Delete Employee");
			System.out.println("6. Display Sorted Employees");
			System.out.println("7. Display Departments");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					System.out.print("ID: ");
					String id = sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Department: ");
					String dept = sc.nextLine();
					System.out.print("Salary: ");
					double sal = sc.nextDouble();

					manager.addEmployee(new Employee(id, name, dept, sal));
					break;

				case 2:
					manager.displayEmployees();
					break;

				case 3:
					System.out.print("Enter ID: ");
					System.out.println(manager.searchEmployee(sc.nextLine()));
					break;

				case 4:
					System.out.print("ID: ");
					String eid = sc.nextLine();
					System.out.print("New Salary: ");
					manager.updateSalary(eid, sc.nextDouble());
					break;

				case 5:
					System.out.print("ID: ");
					manager.deleteEmployee(sc.nextLine());
					break;

				case 6:
					manager.displaySortedEmployees();
					break;

				case 7:
					manager.displayDepartments();
					break;

				case 8:
					System.out.println("Program exited");
					break;

				default:
					System.out.println("Invalid choice");
				}

			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				sc.nextLine();
				choice = 0;
			}

		} while (choice != 8);

		sc.close();
	}
}
