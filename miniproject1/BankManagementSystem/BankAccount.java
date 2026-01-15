package com.miniproject1.BankManagementSystem;

public abstract class BankAccount {

	protected int accountNumber;
	protected String accountHolder;
	protected double balance;

	// Constructor
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Encapsulation (getters)
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// Method Overloading
	public void deposit(double amount) {
		balance += amount;
	}

	public void deposit(double amount, String note) {
		balance += amount;
		System.out.println("Note: " + note);
	}

	// Abstract method
	public abstract void withdraw(double amount);

	// Concrete method
	public void displayDetails() {
		System.out.println("\nAccount Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Balance        : " + balance);
	}

	// Convert object data to text (for file storage)
	public String toFileString() {
		return accountNumber + "," + accountHolder + "," + balance;
	}
}
