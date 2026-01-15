package com.assignment2.question2;

import java.util.Scanner;

public class RegexValidatorDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RegexValidator validator = new RegexValidator();
		int choice = 0;

		do {
			System.out.println("\n--- REGEX VALIDATION MENU ---");
			System.out.println("1. Validate Mobile Number");
			System.out.println("2. Validate Email ID");
			System.out.println("3. Validate Username");
			System.out.println("4. Validate Password");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine(); // consume newline

				switch (choice) {

				case 1:
					System.out.print("Enter Mobile Number: ");
					String mobile = sc.nextLine();
					if (validator.validateMobile(mobile))
						System.out.println("Welcome! Valid Mobile Number");
					else
						System.out.println("Invalid Mobile Number");
					break;

				case 2:
					System.out.print("Enter Email ID: ");
					String email = sc.nextLine();
					if (validator.validateEmail(email))
						System.out.println("Welcome! Valid Email ID");
					else
						System.out.println("Invalid Email ID");
					break;

				case 3:
					System.out.print("Enter Username: ");
					String username = sc.nextLine();
					if (validator.validateUsername(username))
						System.out.println("Welcome! Valid Username");
					else
						System.out.println("Invalid Username");
					break;

				case 4:
					System.out.print("Enter Password: ");
					String password = sc.nextLine();
					if (validator.validatePassword(password))
						System.out.println("Welcome! Strong Password");
					else
						System.out.println("Invalid Password");
					break;

				case 5:
					System.out.println("Program Exited");
					break;

				default:
					System.out.println("Invalid Choice");
				}

			} catch (Exception e) {
				System.out.println("Error: Invalid input");
				sc.nextLine(); // clear input buffer
				choice = 0;
			}

		} while (choice != 5);

		sc.close();
	}
}
