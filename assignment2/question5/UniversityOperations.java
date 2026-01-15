package com.assignment2.question5;

public interface UniversityOperations {

    void addStudent(Student s);
    void displayStudents();
    void removeStudent(String id);
    Student searchStudent(String id);
    void sortByMarks();
    void convertHashMapToTreeMap();
    void countStudentsCourseWise();
    void displayCourses();
}
