package lab2_household.service;

import lab2_household.entities.Family;
import lab2_household.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyService {
    MemberService memberService = new MemberService();
    public Family inputFamily(Scanner scanner){
        ArrayList<Member> members = new ArrayList<>();
        System.out.println("Enter Number House: ");
        int inputNumberHouse = Integer.parseInt(scanner.nextLine());
        while (true){
            System.out.println("Profile thanh vien: ");
            Member member = memberService.inputMemberService(scanner);
            members.add(member);
            System.out.println("Do you want to contines(y/n)");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }
        return new Family(inputNumberHouse, members);
    }
/*    ArrayList<Family> families = new ArrayList<>();

    public Family inputFamily(Scanner scanner) {
        ArrayList<Member> members = new ArrayList<>();
        int inputNumberHouse;
        while (true) {
            System.out.println("Enter Number House: ");
            inputNumberHouse = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            for (Family family : families) {
                if (family.getNumberHouse() == inputNumberHouse) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Duplicate house number.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Profile thành viên: ");
            Member member = memberService.inputMemberService(scanner);
            members.add(member);
            System.out.println("Do you want to continue (y/n)?");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }
        return new Family(inputNumberHouse, members);

    }*/


}
