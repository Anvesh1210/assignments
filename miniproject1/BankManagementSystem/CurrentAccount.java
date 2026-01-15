package com.miniproject1.BankManagementSystem;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Method Overriding
	@Override
	public void withdraw(double amount) {
		if (amount <= balance + 5000) { // overdraft
			balance -= amount;
			System.out.println("Withdrawal successful (Current Account)");
		} else {
			throw new ArithmeticException("Overdraft limit exceeded");
		}
	}
}
