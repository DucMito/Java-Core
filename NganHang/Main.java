
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 100000);
        if(loginUser(account, scanner)){
            while (true){
                choiceUser(account, scanner);
                System.out.println("Tiep tuc khong(Y/N):");
                String retry = scanner.nextLine();
                if(retry.equalsIgnoreCase("N")){
                    System.out.println("thoat chuong tinh");
                    System.exit(0);
                }
            }
        }
    }

    public static boolean loginUser(Account account, Scanner scanner){
        while(true){
            System.out.println("Nhap user: ");
            String inputUser = scanner.nextLine();
            System.out.println("Nhap pass: ");
            String inputPass = scanner.nextLine();
            if(account.getUsername().equals(inputUser) && account.getPassword().equals(inputPass)){
                System.out.println("Login successfully");
                return true;
            }else{
                System.out.println("Login fail !! Again(Y/N)");
                String retry = scanner.nextLine();
                if(retry.equalsIgnoreCase("N")){
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                }
            }
        }
    }

    public static void choiceUser(Account account, Scanner scanner){
        System.out.println("Moi ban nhap: ");
        System.out.println("1. Profile: ");
        System.out.println("2. Withdraw Money: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Username: "  + account.getUsername());
                System.out.println("Password: " + account.getPassword());
                System.out.println("Balance: " + account.getBalance());
                break;
            case 2:
                System.out.println("So tien ban muon rut: ");
                double inputBalance = Double.parseDouble(scanner.nextLine());
                if(inputBalance <= account.getBalance()){
                    account.setBalance(account.getBalance() - inputBalance);
                    System.out.println("So tien da rut: " + inputBalance + "Vao luc: " + java.time.LocalDateTime.now() + "So du: " +account.getBalance());
                }else{
                    System.out.println("So du khong du.");
                }
                break;
            default:
                System.out.println("Moi ban nhap lai lua chon!!");

        }
    }


}