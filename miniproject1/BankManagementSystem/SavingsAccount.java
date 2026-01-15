package com.miniproject1.BankManagementSystem;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Method Overriding
	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful (Savings Account)");
		} else {
			throw new ArithmeticException("Insufficient Balance");
		}
	}
}
