package com.miniproject3.studentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private DBConnection() {
	}

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Anvesh2005");
	}
}
