package extend_lesson_ass3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Nhập số lượng nhân viên: ");
        int number = Integer.parseInt(scanner.nextLine());*/
        int number;
        do {
            System.out.println("Nhập số lượng nhân viên: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) {
                System.out.println("Không hợp lệ! Vui lòng nhập lại.");
            }
        } while (number <= 0);
        Employee[] employees = new Employee[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Thông tin nhân viên " + (i+1) + ": ");
            System.out.print("Id: ");
            int inputId = Integer.parseInt(scanner.nextLine());
            System.out.print("Name: ");
            String inputName = scanner.nextLine();
            System.out.print("Age: ");
            int inputAge = Integer.parseInt(scanner.nextLine());
            System.out.print("Experience: ");
            double inputExperience = Double.parseDouble(scanner.nextLine());
            employees[i] = new Employee(inputId, inputName, inputAge, inputExperience);
        }

        System.out.println("\nThông tin nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.exit(0);
    }
}