package techmaster_v2;

import techmaster_v2.entities.BizStudent;
import techmaster_v2.entities.ItStudent;
import techmaster_v2.entities.TechmasterStudent;
import techmaster_v2.service.BizStudentService;
import techmaster_v2.service.ItStudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinh vien biz: ");
        BizStudentService bizStudentService = new BizStudentService();
        BizStudent bizStudent = bizStudentService.inputBizStudent(scanner);
        bizStudent.printInfo();
        System.out.println(bizStudent);

        System.out.println("Sinh vien it: ");
        ItStudentService itStudentService = new ItStudentService();
        ItStudent itStudent = itStudentService.inputItStudentService(scanner);
        itStudent.printInfo();
        System.out.println(itStudent);*/

        Scanner scanner = new Scanner(System.in);
        BizStudentService bizStudentService = new BizStudentService();
        ItStudentService itStudentService = new ItStudentService();

        System.out.println("Nhap so luong hoc sinh: ");
        int numberStudent = Integer.parseInt(scanner.nextLine());
        TechmasterStudent[] students = new TechmasterStudent[numberStudent];

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Profile student " + (i + 1) + ": ");
            System.out.println("Nhap chuyen nganh (IT/Biz): ");
            String inputMajor = scanner.nextLine();

            if (inputMajor.equalsIgnoreCase("IT")) {
                students[i] = itStudentService.inputItStudentService(scanner);
            } else if (inputMajor.equalsIgnoreCase("Biz")) {
                students[i] = bizStudentService.inputBizStudent(scanner);
            } else {
                System.out.println("Chuyen nganh khong hop le. Vui long nhap lai.");
                i--;
            }
        }

        for (TechmasterStudent student : students) {
            student.printInfo();
            System.out.println();
        }

        System.exit(0);
    }
}

