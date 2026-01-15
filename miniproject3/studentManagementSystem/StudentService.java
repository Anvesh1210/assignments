package com.miniproject3.studentManagementSystem;

import java.sql.*;

public class StudentService {

	public void addStudent(String eno, String name, String branch, int sem, double per) throws Exception {
		if (branch.isEmpty())
			throw new Exception("Branch cannot be empty");
		if (sem <= 0)
			throw new Exception("Semester cannot be empty");
		if (per <= 0)
			throw new Exception("Percentage must be positive");
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?,?,?,?,?)");

		ps.setString(1, eno);
		ps.setString(2, name);
		ps.setString(3, branch);
		ps.setInt(4, sem);
		ps.setDouble(5, per);

		ps.executeUpdate();
		con.close();

		System.out.println("Student added successfully");
	}

	public void displayStudents() throws Exception {
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM students");
		while (rs.next()) {
			System.out.println(rs.getString("eno"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("branch"));
			System.out.println(rs.getInt("sem"));
			System.out.println(rs.getDouble("percentage"));
			System.out.println();
		}

		con.close();
	}

	public void searchStudent(String eno) throws Exception {

		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE eno=?");
		ps.setString(1, eno);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getString("eno"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("branch"));
			System.out.println(rs.getInt("sem"));
			System.out.println(rs.getDouble("percentage"));
		} else {
			System.out.println("Student not found");
		}
		con.close();
	}

	public void updateBranch(String eno, String branch) throws Exception {
		if (branch.isEmpty())
			throw new Exception("Branch cannot be empty");
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE students SET branch=? WHERE eno=?");
		ps.setString(1, branch);
		ps.setString(2, eno);
		int rows = ps.executeUpdate();
		if (rows == 0)
			throw new Exception("Student not found");
		con.close();
		System.out.println("Branch updated successfully");
	}

	public void deleteStudent(String eno) throws Exception {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE eno=?");
		ps.setString(1, eno);
		int rows = ps.executeUpdate();
		if (rows == 0)
			throw new Exception("Student not found");
		con.close();
		System.out.println("Student deleted successfully");
	}

	public void displaySortedStudents() throws Exception {
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM students ORDER BY percentage DESC");

		while (rs.next()) {
			System.out.println(rs.getString("eno"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getDouble("percentage"));
			System.out.println();
		}

		con.close();
	}
}
