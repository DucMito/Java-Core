package techmaster_v2.service;

import techmaster_v2.entities.BizStudent;
import techmaster_v2.entities.TechmasterStudent;

import java.util.Scanner;

public class BizStudentService {
    public TechmasterStudent inputBizStudent(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = scanner.nextLine();
        System.out.println("Mời b nhập điểm marketing: ");
        double marketing = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm sale: ");
        double sale = Double.parseDouble(scanner.nextLine());

        return new BizStudent(name, major, marketing, sale);
    }
}
