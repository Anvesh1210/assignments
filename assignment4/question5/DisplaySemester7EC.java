package com.assignment4.question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplaySemester7EC {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");

			st = conn.createStatement();

			String query = "SELECT * FROM Students " + "WHERE semester = 7 AND branch = 'EC'";

			rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString("enrollment_no"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("branch"));
				System.out.println(rs.getInt("semester"));
				System.out.println(rs.getDouble("percentage"));
				System.out.println(rs.getInt("year_of_passing"));
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Display failed");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}
