package lab2.view;

import lab2.entities.Student;
import lab2.service.StudentService;

import java.util.Scanner;

public class StudentView {
    private StudentService studentService;
    private Scanner scanner;

    public StudentView(/*Scanner scanner*/){
        studentService = new StudentService();
        scanner = new Scanner(System.in);
    }

    public void inputStudent(){
        boolean continueInput = true;

        while (continueInput){
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Math:");
            double scoreMath = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter Physic:");
            double scorePhysic = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter Chemistry:");
            double scoreChemistry = Double.parseDouble(scanner.nextLine());

            Student student = new Student(name, scoreMath,scorePhysic,scoreChemistry);
            studentService.addStudent(student);

            while (true){
                System.out.println("Do you want to continue(y/n)");
                String response = scanner.nextLine();

                if(response.equalsIgnoreCase("n")){
                    continueInput = false;
                    return;
                }else if(response.equalsIgnoreCase("y")){
                    break;
                }else
                    System.out.println("Choose (y/n)");
            }
        }
    }

    public void displayAllStudent(){
        System.out.println("List of student");
        for (Student student: studentService.getAllStudents()){
            System.out.println(student);
        }
    }

    public void displayCalculate(){
        System.out.println("Percent: ");
        studentService.calculateStudent();
    }

}
