package com.assignment2.question5;

public class Student {
	private String studentId;
	private String name;
	private String course;
	private int marks;

	public Student(String studentId, String name, String course, int marks) {
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getCourse() {
		return course;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "ID: " + studentId + ", Name: " + name + ", Course: " + course + ", Marks: " + marks;
	}
}
