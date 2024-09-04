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
                    loginUser();
                    break;
                case 2:
                    registerUser();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }


    public static void loginUser() {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        if (userService.login(username, password)) {
            System.out.println("Chào mừng " + username + "!");
            userMenu(scanner, userService, username);
        } else {
            System.out.println("Đăng nhập thất bại. Username hoặc mật khẩu không chính xác.");
        }
    }


    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.println("Nhập username:");
        String username = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập password (7-15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt):");
        String password = scanner.nextLine();
        if (!userService.isValidPassword(password)) {
            System.out.println("Mật khẩu không hợp lệ.");
            return;
        }
        if (userService.register(username, password, email)) {
            System.out.println("Đăng ký thành công!");
        } else {
            System.out.println("Username đã tồn tại.");
        }
    }

    public static void userMenu(Scanner scanner, UserService userService, String username) {
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
                    if (userService.changeUsername(username, newUsername)) {
                        System.out.println("Change username successful");
                        username = newUsername; // Update to new username
                    } else {
                        System.out.println("Change fail.");
                    }
                    break;
                case 2:
                    System.out.println("Enter new email:");
                    String newEmail = scanner.nextLine();
                    if (userService.changeEmail(username, newEmail)) {
                        System.out.println("Change email successful.");
                    } else {
                        System.out.println("Change fail.");
                    }
                    break;
                case 3:
                    System.out.println("Enter new password:");
                    String newPassword = scanner.nextLine();
                    if (userService.isValidPassword(newPassword) && userService.changePassword(username, newPassword)) {
                        System.out.println("Change successful.");
                    } else {
                        System.out.println("Change fail.");
                    }
                    break;
                case 4:
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
