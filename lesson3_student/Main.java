package lesson3_student;

import lesson3_student.entities.Student;
import lesson3_student.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter marks: ");
        double marks = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name, age, marks);
        StudentService studentService = new StudentService(student);
        studentService.classify();
        studentService.display();
    }
}
