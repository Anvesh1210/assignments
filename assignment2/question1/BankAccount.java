package com.assignment2.question1;

public class BankAccount implements BankingOperations, CustomerOperations {

	private int accountNumber;
	private String customerName;
	private double balance;

	// Constructor
	public BankAccount(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	// Deposit
	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be greater than zero");
		}
		balance += amount;
		System.out.println("Deposit successful");
	}

	// Withdraw
	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
		}
		if (amount > balance) {
			throw new ArithmeticException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Withdrawal successful");
	}

	// Check Balance
	@Override
	public double checkBalance() {
		return balance;
	}

	// Display Customer Details
	@Override
	public void displayCustomerDetails() {
		System.out.println("\n--- Customer Details ---");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Balance        : " + balance);
	}
}
