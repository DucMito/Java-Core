package techmaster_v2.service;

import techmaster_v2.entities.ItStudent;
import techmaster_v2.entities.TechmasterStudent;

import java.util.Scanner;

public class ItStudentService {
    public TechmasterStudent inputItStudentService(Scanner scanner){
        System.out.println("Moi ban nhap ten: ");
        String inputName = scanner.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String inputMajor = scanner.nextLine();
        System.out.println("Nhap diem html: ");
        double inputHtml = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem css: ");
        double inputCss = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem java: ");
        double inputJava = Double.parseDouble(scanner.nextLine());

        return new ItStudent(inputName, inputMajor, inputHtml, inputCss,inputJava);
    }
}
