package com.assignment1.question2;

import java.util.Scanner;

public class ArrayOperationsDriver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayOperations obj = new ArrayOperations();

		int choice;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Linear Search");
			System.out.println("4. Binary Search");
			System.out.println("5. Find Maximum");
			System.out.println("6. Count Even/Odd");
			System.out.println("7. Insertion Sort");
			System.out.println("8. Display");
			System.out.println("9. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.insert();
				break;
			case 2:
				obj.delete();
				break;
			case 3:
				obj.linearSearch();
				break;
			case 4:
				obj.binarySearch();
				break;
			case 5:
				obj.findMax();
				break;
			case 6:
				obj.countEvenOdd();
				break;
			case 7:
				obj.insertionSort();
				break;
			case 8:
				obj.display();
				break;
			case 9:
				System.out.println("Program exited");
				break;
			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 9);

		sc.close();
	}
}
