package com.assignment2.question3;

import java.util.*;
import java.util.regex.Pattern;

public class StudentManager implements StudentOperations {

	// You can switch collection type here
	private List<Student> students;

	public StudentManager(int choice) {
		if (choice == 1)
			students = new ArrayList<>();
		else if (choice == 2)
			students = new Vector<>();
		else
			students = new ArrayList<>();
	}

	// REGEX validation for name
	private boolean isValidName(String name) {
		return Pattern.matches("[A-Za-z ]{3,20}", name);
	}

	@Override
	public void addStudent(Student s) {
		students.add(s);
		System.out.println("Student added successfully");
	}

	@Override
	public void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("No student records found");
			return;
		}
		for (Student s : students) {
			System.out.println(s);
		}
	}

	@Override
	public void removeStudent(int rollNo) {
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getRollNo() == rollNo) {
				it.remove();
				System.out.println("Student removed successfully");
				return;
			}
		}
		System.out.println("Student not found");
	}

	@Override
	public Student searchStudent(int rollNo) {
		for (Student s : students) {
			if (s.getRollNo() == rollNo)
				return s;
		}
		return null;
	}

	// Used before adding student
	public boolean validateStudentName(String name) {
		return isValidName(name);
	}
}
