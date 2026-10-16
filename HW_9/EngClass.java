package edu.neu.mgen;

import java.util.ArrayList;

public class EngClass {
    //ArrayList to hold students in the class
    private ArrayList<Student> students = new ArrayList<>();

    //Add a student to the class
    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                System.out.println("Student with ID " + student.getStudentId() + " already exists in the class, so " + student.getFirstName() + " " + student.getLastName() + " will not be added to the class.");
                return;
            }
        }
        students.add(student);
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " added to the class.");
    }

    //Delete a student from the class
    public void deleteStudent(int studentId) {
        boolean removed = students.removeIf(s -> s.getStudentId() == studentId);
        if (removed) {
            System.out.println("Student with ID " + studentId + " deleted from the class.");
        } else {
            System.out.println("Student with ID " + studentId + " not found in the class.");
        }
    }

    //Read all students in the class
    public void readStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the class.");
            return;
        } 

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {

        //Create an instance of Student
        Student student1 = new Student(1001, "Tom", "Baker");
        Student student2 = new Student(1002, "Jane", "Watson");
        Student student3 = new Student(1003, "Oliver", "Twist");
        Student student4 = new Student(1001, "Daniel", "Martin"); // Duplicate student ID

        //Create an instance of EngClass
        EngClass engClass = new EngClass();

        //Add students to the class
        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.addStudent(student3);
        System.out.println("\n");
        engClass.addStudent(student4); // This will not be added due to duplicate ID
        
        //Display all students in the class
        System.out.println("\nStudents in the class:");
        engClass.readStudents();

        System.out.println("\n");
        
        //Delete a student from the class
        engClass.deleteStudent(1003);

        System.out.println("\n");
        engClass.deleteStudent(1005);  // Attempt to delete a non-existent student

        //Display all students in the class after deletion
        System.out.println("\nStudents in the class after deletion:");
        engClass.readStudents();

    }
}
