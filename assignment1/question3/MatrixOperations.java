package com.assignment1.question3;

import java.util.Scanner;

public class MatrixOperations {
	Scanner sc = new Scanner(System.in);

	// Read matrix
	public int[][] readMatrix(int r, int c) {
		int[][] m = new int[r][c];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		return m;
	}

	// Display matrix
	public void display(int[][] m, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Addition
	public void add(int[][] a, int[][] b, int r, int c) {
		int[][] sum = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				sum[i][j] = a[i][j] + b[i][j];

		System.out.println("Addition:");
		display(sum, r, c);
	}

	// Subtraction
	public void subtract(int[][] a, int[][] b, int r, int c) {
		int[][] sub = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				sub[i][j] = a[i][j] - b[i][j];

		System.out.println("Subtraction:");
		display(sub, r, c);
	}

	// Multiplication
	public void multiply(int[][] a, int[][] b, int r, int c) {
		int[][] mul = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				for (int k = 0; k < c; k++)
					mul[i][j] += a[i][k] * b[k][j];

		System.out.println("Multiplication:");
		display(mul, r, c);
	}

	// Transpose
	public void transpose(int[][] m, int r, int c) {
		System.out.println("Transpose:");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(m[j][i] + " ");
			}
			System.out.println();
		}
	}

	// Check Square Matrix
	public boolean isSquare(int r, int c) {
		return r == c;
	}

	// Check Diagonal Matrix
	public boolean isDiagonal(int[][] m, int n) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i != j && m[i][j] != 0)
					return false;
		return true;
	}

	// Check Identity Matrix
	public boolean isIdentity(int[][] m, int n) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (i == j && m[i][j] != 1)
					return false;
				if (i != j && m[i][j] != 0)
					return false;
			}
		return true;
	}
}
