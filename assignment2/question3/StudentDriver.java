package com.assignment2.question3;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Collection Type:");
		System.out.println("1. ArrayList");
		System.out.println("2. Vector");
		System.out.print("Enter choice: ");
		int colChoice = sc.nextInt();

		StudentManager manager = new StudentManager(colChoice);

		int choice;

		do {
			System.out.println("\n--- STUDENT MENU ---");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Remove Student by Roll No");
			System.out.println("4. Search Student by Roll No");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine(); // buffer clear

				switch (choice) {

				case 1:
					System.out.print("Enter Roll No: ");
					int roll = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					if (!manager.validateStudentName(name)) {
						System.out.println("Invalid Name (only letters, min 3 chars)");
						break;
					}

					manager.addStudent(new Student(roll, name));
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter Roll No to remove: ");
					manager.removeStudent(sc.nextInt());
					break;

				case 4:
					System.out.print("Enter Roll No to search: ");
					Student s = manager.searchStudent(sc.nextInt());
					if (s != null)
						System.out.println(s);
					else
						System.out.println("Student not found");
					break;

				case 5:
					System.out.println("Program exited");
					break;

				default:
					System.out.println("Invalid choice");
				}

			} catch (Exception e) {
				System.out.println("Error: Invalid input");
				sc.nextLine(); // clear buffer
				choice = 0;
			}

		} while (choice != 5);

		sc.close();
	}
}
