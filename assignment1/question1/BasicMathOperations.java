package com.assignment1.question1;

public class BasicMathOperations {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed");
			return 0;
		}
		return (double) a / b;
	}

	public int remainder(int a, int b) {
		return a % b;
	}

	public int square(int a) {
		return a * a;
	}

	public int cube(int a) {
		return a * a * a;
	}

	public int absolute(int a) {
		return Math.abs(a);
	}
}
