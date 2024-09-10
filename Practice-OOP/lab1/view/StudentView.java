package lab1.view;

import lab1.entities.Student;
import lab1.service.StudentService;

import java.util.Scanner;

public class StudentView {
    private Scanner scanner;
    private StudentService studentService;

    public StudentView() {
        scanner = new Scanner(System.in);
        studentService = new StudentService();
    }
    public void inputStudents() {
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine().trim();
            System.out.println("Enter student address:");
            String address = scanner.nextLine().trim();
            Student student = new Student(name, address);
            studentService.addStudent(student);
            while (true) {
                System.out.println("Do you want to add another student? (y/n):");
                String response = scanner.nextLine().trim().toLowerCase();
                if (response.equalsIgnoreCase("n")) {
                    continueInput = false;
                    break;
                } else if (response.equalsIgnoreCase("y")) {
                    break;
                } else {
                    System.out.println("please enter 'yes' or 'no'.");
                }
            }
        }
    }

    public void displayStudents() {
        System.out.println("List of all students:");
        for (Student student : studentService.getAllStudents()) {
            System.out.println(student);
        }
    }
}
