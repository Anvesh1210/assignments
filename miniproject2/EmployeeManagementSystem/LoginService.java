package com.miniproject2.EmployeeManagementSystem;

import java.util.Scanner;

public class LoginService {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin123";

	public static boolean login() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Username: ");
		String u = sc.nextLine();

		System.out.print("Password: ");
		String p = sc.nextLine();

		return USERNAME.equals(u) && PASSWORD.equals(p);
	}
}
