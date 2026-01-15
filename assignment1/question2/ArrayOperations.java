package com.assignment1.question2;

import java.util.Scanner;

public class ArrayOperations {
	private int[] arr = new int[100];
	private int size = 0;
	private Scanner sc = new Scanner(System.in);

	// Insert element
	public void insert() {
		System.out.print("Enter element to insert: ");
		arr[size] = sc.nextInt();
		size++;
		System.out.println("Element inserted");
	}

	// Delete element
	public void delete() {
		System.out.print("Enter element to delete: ");
		int key = sc.nextInt();
		int pos = -1;

		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				pos = i;
				break;
			}
		}

		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			for (int i = pos; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			size--;
			System.out.println("Element deleted");
		}
	}

	// Linear Search
	public void linearSearch() {
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				System.out.println("Element found at position " + (i + 1));
				return;
			}
		}
		System.out.println("Element not found");
	}

	// Binary Search (array must be sorted)
	public void binarySearch() {
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();

		int low = 0, high = size - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				System.out.println("Element found at position " + (mid + 1));
				return;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Element not found");
	}

	// Find Maximum
	public void findMax() {
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Maximum element: " + max);
	}

	// Count Even and Odd
	public void countEvenOdd() {
		int even = 0, odd = 0;

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.println("Even count: " + even);
		System.out.println("Odd count: " + odd);
	}

	// Insertion Sort
	public void insertionSort() {
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("Array sorted using Insertion Sort");
	}

	// Display Array
	public void display() {
		System.out.print("Array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
