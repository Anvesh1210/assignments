package com.assignment4.question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateCSEPercentage {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");

			st = conn.createStatement();

			String query = "UPDATE Students " + "SET percentage = percentage + (percentage * 0.05) "
					+ "WHERE branch = 'CSE'";

			int rows = st.executeUpdate(query);

			System.out.println(rows + " record(s) updated");

		} catch (Exception e) {
			System.out.println("Update failed");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
