package com.assignment2.question1;

import java.util.Scanner;

public class BankAccountDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		BankAccount account = new BankAccount(accNo, name, balance);

		int choice;

		do {
			System.out.println("\n--- BANK MENU ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Display Customer Details");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter deposit amount: ");
					account.deposit(sc.nextDouble());
					break;

				case 2:
					System.out.print("Enter withdrawal amount: ");
					account.withdraw(sc.nextDouble());
					break;

				case 3:
					System.out.println("Current Balance: " + account.checkBalance());
					break;

				case 4:
					account.displayCustomerDetails();
					break;

				case 5:
					System.out.println("Thank you for using Bank Application");
					break;

				default:
					System.out.println("Invalid choice");
				}
			} catch (IllegalArgumentException | ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} while (choice != 5);

		sc.close();
	}
}
