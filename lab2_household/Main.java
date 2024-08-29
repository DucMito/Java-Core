package lab2_household;

import lab2_household.entities.Family;
import lab2_household.service.FamilyService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyService familyService = new FamilyService();
        Scanner scanner = new Scanner(System.in);
        Family family = familyService.inputFamily(scanner);
        System.out.println(family);
    }
}
