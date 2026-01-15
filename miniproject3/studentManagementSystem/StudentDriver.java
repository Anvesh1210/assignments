package com.miniproject3.studentManagementSystem;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		if (!LoginService.login()) {
			System.out.println("Invalid Login");
			return;
		}
		StudentService service = new StudentService();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- STUDENT MENU ---");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student by Eno");
			System.out.println("4. Update Student Branch");
			System.out.println("5. Delete Student by Eno");
			System.out.println("6. Display Sorted Students");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					System.out.print("Eno: ");
					String eno = sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Branch: ");
					String branch = sc.nextLine();
					System.out.print("Semester: ");
					int sem = sc.nextInt();
					System.out.print("Percentage: ");
					double per = sc.nextDouble();

					service.addStudent(eno, name, branch, sem, per);
					break;

				case 2:
					service.displayStudents();
					break;

				case 3:
					System.out.print("Enter Eno: ");
					service.searchStudent(sc.nextLine());
					break;

				case 4:
					System.out.print("Enter Eno: ");
					String e = sc.nextLine();
					System.out.print("Enter New Branch: ");
					service.updateBranch(e, sc.nextLine());
					break;

				case 5:
					System.out.print("Enter Eno: ");
					service.deleteStudent(sc.nextLine());
					break;

				case 6:
					service.displaySortedStudents();
					break;

				case 7:
					System.out.println("Program exited");
					break;

				default:
					System.out.println("Invalid choice");
				}

			} catch (Exception ex) {
				System.out.println("Error: " + ex.getMessage());
				sc.nextLine();
				choice = 0;
			}

		} while (choice != 7);

		sc.close();
	}
}
