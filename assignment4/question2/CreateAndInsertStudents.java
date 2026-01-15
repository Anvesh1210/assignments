package com.assignment4.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateAndInsertStudents {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");

			st = conn.createStatement();

			String createTable = "CREATE TABLE IF NOT EXISTS Students (" + "enrollment_no VARCHAR(20) PRIMARY KEY,"
					+ "name VARCHAR(50)," + "branch VARCHAR(20)," + "semester INT," + "percentage DOUBLE,"
					+ "year_of_passing INT" + ")";

			st.executeUpdate(createTable);

			String insertData = "INSERT INTO Students VALUES " + "('ENR101','Ravi','CSE',7,78.5,2024),"
					+ "('ENR102','Amit','EC',7,72.0,2025)," + "('ENR103','Neha','Civil',6,69.4,2024)";

			st.executeUpdate(insertData);

			System.out.println("Table created and records inserted");

		} catch (Exception e) {
			System.out.println("Operation failed");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
