// Main.java
import service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();

        while (true) {
            System.out.println("Chọn một tùy chọn:");
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    loginUser(scanner, userService);
                    break;
                case 2:
                    registerUser(scanner, userService);
                    break;
                default:
                    System.out.println("Chọn (1 or 2).");
            }
        }
    }

    private static void loginUser(Scanner scanner, UserService userService) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        userService.login(username, password);
    }

    private static void registerUser(Scanner scanner, UserService userService) {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter password (7-15 ký tự, chứa in hoa(min 1 kí tự), 1 ký tự đặc biệt):");
        String password = scanner.nextLine();
        if (userService.isValidPassword(password)) {
            userService.register(username, password, email);
        } else {
            System.out.println("Password không thỏa mãn");
        }
    }

    private static void userMenu(Scanner scanner, UserService userService, String username) {
        while (true) {
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            int choiceMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceMenu) {
                case 1:
                    System.out.println("Enter new username:");
                    String newUsername = scanner.nextLine();
                    userService.changeUsername(username, newUsername);
                    username = newUsername;
                    break;
                case 2:
                    System.out.println("Enter new email:");
                    String newEmail = scanner.nextLine();
                    userService.changeEmail(username, newEmail);
                    break;
                case 3:
                    System.out.println("Enter new password:");
                    String newPassword = scanner.nextLine();
                    userService.changePassword(username, newPassword);
                    break;
                case 4:
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chon (1 or 2 or 3 or 4).");
            }
        }
    }
}
