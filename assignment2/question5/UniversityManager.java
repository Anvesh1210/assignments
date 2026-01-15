package com.assignment2.question5;

import java.util.*;
import java.util.regex.Pattern;

public class UniversityManager implements UniversityOperations {
	// List implementations
	private List<Student> studentList = new ArrayList<>();
	private Vector<Student> studentVector = new Vector<>();
	private Stack<Student> studentStack = new Stack<>();

	// Map implementations
	private Map<String, Student> studentMap = new HashMap<>();
	private Map<String, Student> studentTable = new Hashtable<>();

	// Set for unique courses
	private Set<String> courses = new HashSet<>();

	// REGEX validation for Student ID (STU123)
	public boolean validateStudentId(String id) {
		return Pattern.matches("STU[0-9]{3}", id);
	}

	// Prevent duplicate student IDs
	private boolean isDuplicate(String id) {
		return studentMap.containsKey(id);
	}

	@Override
	public void addStudent(Student s) {
		if (isDuplicate(s.getStudentId())) {
			throw new IllegalArgumentException("Duplicate Student ID not allowed");
		}

		studentList.add(s);
		studentVector.add(s);
		studentStack.push(s);
		studentMap.put(s.getStudentId(), s);
		studentTable.put(s.getStudentId(), s);
		courses.add(s.getCourse());

		System.out.println("Student added successfully");
	}

	@Override
	public void displayStudents() {
		if (studentList.isEmpty()) {
			System.out.println("No students found");
			return;
		}
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	@Override
	public void removeStudent(String id) {
		Student s = studentMap.remove(id);

		if (s == null) {
			System.out.println("Student not found");
			return;
		}

		studentList.remove(s);
		studentVector.remove(s);
		studentStack.remove(s);
		studentTable.remove(id);

		System.out.println("Student removed successfully");
	}

	@Override
	public Student searchStudent(String id) {
		return studentMap.get(id);
	}

	@Override
	public void sortByMarks() {
		studentList.sort(Comparator.comparingInt(Student::getMarks).reversed());
		System.out.println("Students sorted by marks");
	}

	// HashMap → TreeMap conversion
	@Override
	public void convertHashMapToTreeMap() {
		TreeMap<String, Student> treeMap = new TreeMap<>(studentMap);
		System.out.println("HashMap converted to TreeMap (Sorted by ID)");
		for (Student s : treeMap.values()) {
			System.out.println(s);
		}
	}

	// Course-wise student count
	@Override
	public void countStudentsCourseWise() {
		Map<String, Integer> countMap = new HashMap<>();

		for (Student s : studentList) {
			countMap.put(s.getCourse(), countMap.getOrDefault(s.getCourse(), 0) + 1);
		}

		for (Map.Entry<String, Integer> e : countMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

	// Display unique courses
	@Override
	public void displayCourses() {
		System.out.println("Unique Courses:");
		for (String c : courses) {
			System.out.println(c);
		}
	}
}
