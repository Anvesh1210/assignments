package com.assignment1.question3;

import java.util.Scanner;

public class MatrixOperationsDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MatrixOperations obj = new MatrixOperations();

		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int[][] A = obj.readMatrix(r, c);
		int[][] B = obj.readMatrix(r, c);

		obj.add(A, B, r, c);
		obj.subtract(A, B, r, c);

		if (obj.isSquare(r, c)) {
			obj.multiply(A, B, r, c);
			obj.transpose(A, r, c);

			if (obj.isDiagonal(A, r))
				System.out.println("Matrix A is Diagonal");
			else
				System.out.println("Matrix A is NOT Diagonal");

			if (obj.isIdentity(A, r))
				System.out.println("Matrix A is Identity");
			else
				System.out.println("Matrix A is NOT Identity");

		} else {
			System.out.println("Matrix is NOT a Square Matrix");
		}

		sc.close();
	}
}
