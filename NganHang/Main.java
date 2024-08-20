import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 10000);
        if (loginUser(account, scanner)){
            boolean running = true;
            while (running){
                choiceUser(account, scanner);
                running = confirmUser(scanner);
            }
        }
        scanner.close();
    }

    public static boolean loginUser(Account account, Scanner scanner){
        while (true){
            System.out.println("Nhap username: ");
            String inputUser = scanner.nextLine();
            System.out.println("Nhap password: ");
            String inputPass = scanner.nextLine();
            if(account.getUsername().equals(inputUser) && account.getPassword().equals(inputPass)){
                System.out.println("Login thanh cong");
                return true;
            }else{
                System.out.println("Login that bai. Thu lai(Y/N)");
                String retry = scanner.nextLine();
                if(retry.equalsIgnoreCase("N")) {
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                }
            }
        }
    }

    public static void choiceUser(Account account, Scanner scanner){
        System.out.println("Moi ban chon yeu cau: ");
        System.out.println("1. Show profile: ");
        System.out.println("2. Withdraw Money: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Username: " + account.getUsername());
                System.out.println("Password: " + account.getPassword());
                System.out.println("Balance: " + account.getBalance());
                break;
            case 2:
                System.out.println("Nhap so tien rut: ");
                double inputBalance = Double.parseDouble(scanner.nextLine());
                if(inputBalance <= account.getBalance()){
                    account.setBalance(account.getBalance() - inputBalance);
                    System.out.println("So tien da rut: " + inputBalance + "con lai: " + account.getBalance() + "Vao luc:  " + java.time.LocalDateTime.now());
                }else{
                    System.out.println("So tien khong du");
                    break;
                }
            default:
                System.out.println("Lua chon lai");

        }

    }

    public static boolean confirmUser(Scanner scanner){
        System.out.println("Co tiep tuc(Y/N): ");
        String continueChoice = scanner.nextLine();
        if(continueChoice.equalsIgnoreCase("N")){
            System.out.println("Thoat chuong trinh.");
            System.exit(0);
        }
        return true;
    }

}
