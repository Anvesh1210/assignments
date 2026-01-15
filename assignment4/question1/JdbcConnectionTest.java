package com.assignment4.question1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionTest {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");

			if (conn != null) {
				System.out.println("Connection Successful");
			}

		} catch (Exception e) {
			System.out.println("Unable to connect");
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
