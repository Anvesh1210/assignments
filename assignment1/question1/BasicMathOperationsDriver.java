package com.assignment1.question1;

import java.util.Scanner;

public class BasicMathOperationsDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicMathOperations obj = new BasicMathOperations();
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("Addition: " + obj.add(num1, num2));
		System.out.println("Subtraction: " + obj.subtract(num1, num2));
		System.out.println("Multiplication: " + obj.multiply(num1, num2));
		System.out.println("Division: " + obj.divide(num1, num2));
		System.out.println("Remainder: " + obj.remainder(num1, num2));
		System.out.println("Square of first number: " + obj.square(num1));
		System.out.println("Cube of first number: " + obj.cube(num1));
		System.out.println("Absolute value of first number: " + obj.absolute(num1));

		sc.close();
	}
}
