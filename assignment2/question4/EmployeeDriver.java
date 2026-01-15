package com.assignment2.question4;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Map Type:");
		System.out.println("1. HashMap");
		System.out.println("2. Hashtable");
		System.out.println("3. TreeMap");
		System.out.print("Enter choice: ");
		int mapChoice = sc.nextInt();
		sc.nextLine();

		EmployeeManager manager = new EmployeeManager(mapChoice);
		manager.demonstrateNullSupport();

		int choice;

		do {
			System.out.println("\n--- EMPLOYEE MENU ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Remove Employee by ID");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					System.out.print("Enter Employee ID (EMP123): ");
					String id = sc.nextLine();

					if (!manager.validateEmpId(id)) {
						System.out.println("Invalid Employee ID format");
						break;
					}

					System.out.print("Enter Employee Name: ");
					String name = sc.nextLine();

					manager.addEmployee(new Employee(id, name));
					break;

				case 2:
					manager.displayEmployees();
					break;

				case 3:
					System.out.print("Enter Employee ID to search: ");
					Employee e = manager.searchEmployee(sc.nextLine());
					if (e != null)
						System.out.println(e);
					else
						System.out.println("Employee not found");
					break;

				case 4:
					System.out.print("Enter Employee ID to remove: ");
					manager.removeEmployee(sc.nextLine());
					break;

				case 5:
					System.out.println("Program exited");
					break;

				default:
					System.out.println("Invalid choice");
				}

			} catch (Exception ex) {
				System.out.println("Error: Invalid input");
				sc.nextLine();
				choice = 0;
			}

		} while (choice != 5);

		sc.close();
	}
}
