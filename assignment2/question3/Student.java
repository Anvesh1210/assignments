package com.assignment2.question3;

public class Student {
	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Roll No: " + rollNo + ", Name: " + name;
	}
}
