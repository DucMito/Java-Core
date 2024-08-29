package lab2_household.service;

import lab2_household.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
    public Member inputMemberService(Scanner scanner){
        System.out.println("Enter FullName: ");
        String inputFullName = scanner.nextLine();
        System.out.println("Enter Dob: ");
        String inputDateOfBirth = scanner.nextLine();
        System.out.println("Enter job: ");
        String inputJob = scanner.nextLine();
        return new Member(inputFullName, inputDateOfBirth, inputJob);
    }


}
