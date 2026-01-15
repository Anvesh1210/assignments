package com.miniproject1.BankManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankDriver {
	static final String FILE_NAME = "bankdata.txt";

    // Save account to file (text)
    public static void saveToFile(BankAccount acc) throws IOException {
        FileWriter fw = new FileWriter(FILE_NAME);
        fw.write(acc.toFileString());
        fw.close();
        System.out.println("Account data saved to file");
    }

    // Load account from file (text)
    public static void loadFromFile() throws IOException {
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
        String data = br.readLine();
        br.close();

        if (data != null) {
            String[] parts = data.split(",");
            System.out.println("\n--- LOADED ACCOUNT DATA ---");
            System.out.println("Account Number : " + parts[0]);
            System.out.println("Account Holder : " + parts[1]);
            System.out.println("Balance        : " + parts[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        try {
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Choose account type: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            // Runtime Polymorphism
            if (type == 1)
                account = new SavingsAccount(accNo, name, balance);
            else
                account = new CurrentAccount(accNo, name, balance);

            int choice;
            do {
                System.out.println("\n--- BANK MENU ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Display Account Details");
                System.out.println("5. Save to File");
                System.out.println("6. Load from File");
                System.out.println("7. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Balance: " + account.getBalance());
                        break;

                    case 4:
                        account.displayDetails();
                        break;

                    case 5:
                        saveToFile(account);
                        break;

                    case 6:
                        loadFromFile();
                        break;

                    case 7:
                        System.out.println("Program exited");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 7);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
