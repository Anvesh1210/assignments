package com.assignment4.question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCivil2024 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");

			st = conn.createStatement();

			String query = "DELETE FROM Students " + "WHERE year_of_passing = 2024 AND branch = 'Civil'";

			int rows = st.executeUpdate(query);

			System.out.println(rows + " record(s) deleted");

		} catch (Exception e) {
			System.out.println("Delete operation failed");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
