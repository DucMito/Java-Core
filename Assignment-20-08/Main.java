import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 10000);
        if (loginUser(account, scanner)) {
            boolean running = true;
            while (running) {
                choiceUser(account, scanner);
                running = confirmUser(scanner);
            }
        }
        scanner.close();
    }

    private static boolean loginUser(Account account, Scanner scanner) {
        while (true) {
            System.out.println("Nhập username:");
            String inputUsername = scanner.nextLine();
            System.out.println("Nhập password:");
            String inputPassword = scanner.nextLine();
            if (account.getUsername().equals(inputUsername) && account.getPassword().equals(inputPassword)) {
                System.out.println("Login thành công!");
                return true;
            } else {
                System.out.println("Login thất bại. Bạn có muốn thử lại không? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                }
            }
        }
    }

    private static void choiceUser(Account account, Scanner scanner) {
        System.out.println("Chọn một tính năng:");
        System.out.println("1. Xem thông tin tài khoản");
        System.out.println("2. Rút tiền");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Username: " + account.getUsername());
                System.out.println("Password: " + account.getPassword());
                System.out.println("Balance: " + account.getBalance());
                break;
            case 2:
                System.out.println("Nhập số tiền muốn rút:");
                double amount = Double.parseDouble(scanner.nextLine());
                if (amount <= account.getBalance()) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Bạn đã rút " + amount + " VNĐ vào lúc " + java.time.LocalDateTime.now());
                } else {
                    System.out.println("Tiền không đủ.");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static boolean confirmUser(Scanner scanner) {
        System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
        String continueChoice = scanner.nextLine();
        if (continueChoice.equalsIgnoreCase("N")) {
            System.out.println("Thoát chương trình...");
            System.exit(0);
        }
        return true;
    }
}
