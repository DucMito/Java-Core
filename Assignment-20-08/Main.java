import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Account account = new Account("techmaster", "hoclacoviec", 1000000);

    public static void main(String[] args) {
        if (login()) {
            boolean running = true;
            while (running) {
                displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
                handleUserChoice(choice);
                running = askToContinue();
            }
        }
        scanner.close();
        System.exit(0);
    }



    private static boolean login() {
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Nhập username:");
            String inputUsername = scanner.nextLine();

            System.out.println("Nhập password:");
            String inputPassword = scanner.nextLine();

            if (account.getUsername().equals(inputUsername) && account.getPassword().equals(inputPassword)) {
                loggedIn = true;
                System.out.println("Login thành công!");
            } else {
                System.out.println("Login thất bại. Bạn có muốn thử lại không? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void displayMenu() {
        System.out.println("Chọn một tính năng:");
        System.out.println("1. Xem thông tin tài khoản");
        System.out.println("2. Rút tiền");
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                account.displayInfo();
                break;
            case 2:
                handleWithdraw();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void handleWithdraw() {
        System.out.println("Nhập số tiền muốn rút:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        account.withdraw(amount);
    }

    private static boolean askToContinue() {
        System.out.println("Do you want to continue? (Y/N)");
        String continueChoice = scanner.nextLine();
        return continueChoice.equalsIgnoreCase("Y");
    }
}
