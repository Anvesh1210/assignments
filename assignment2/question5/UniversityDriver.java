package com.assignment2.question5;

import java.util.Scanner;

public class UniversityDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UniversityManager manager = new UniversityManager();
		int choice;
		do {
			System.out.println("\n--- UNIVERSITY MENU ---");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Remove Student by ID");
			System.out.println("4. Search Student by ID");
			System.out.println("5. Sort Students by Marks");
			System.out.println("6. Convert HashMap to TreeMap");
			System.out.println("7. Count Students Course-wise");
			System.out.println("8. Display All Courses");
			System.out.println("9. Exit");
			System.out.print("Enter choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					System.out.print("Enter Student ID (STU123): ");
					String id = sc.nextLine();

					if (!manager.validateStudentId(id)) {
						System.out.println("Invalid Student ID format");
						break;
					}

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Course: ");
					String course = sc.nextLine();

					System.out.print("Enter Marks: ");
					int marks = sc.nextInt();

					manager.addStudent(new Student(id, name, course, marks));
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter Student ID: ");
					manager.removeStudent(sc.nextLine());
					break;

				case 4:
					System.out.print("Enter Student ID: ");
					Student s = manager.searchStudent(sc.nextLine());
					System.out.println(s != null ? s : "Student not found");
					break;

				case 5:
					manager.sortByMarks();
					manager.displayStudents();
					break;

				case 6:
					manager.convertHashMapToTreeMap();
					break;

				case 7:
					manager.countStudentsCourseWise();
					break;

				case 8:
					manager.displayCourses();
					break;

				case 9:
					System.out.println("Program exited");
					break;

				default:
					System.out.println("Invalid choice");
				}

			} catch (Exception e) {
				System.out.println("Error: Invalid input");
				sc.nextLine();
				choice = 0;
			}

		} while (choice != 9);

		sc.close();
	}
}
