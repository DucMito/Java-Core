package lab3.view;

import lab3.entities.Worker;
import lab3.service.WorkerService;

import java.util.Scanner;

public class WorkerView {
    private WorkerService workerService;
    private Scanner scanner;

    public WorkerView(){
        workerService = new WorkerService();
        scanner = new Scanner(System.in);
    }

    public void displayMenuChoice(){
        int choice;
        do{
            System.out.println("===== WORKER MENU =====");
            System.out.println("1. Add new worker");
            System.out.println("2. Increase worker's salary");
            System.out.println("3. Decrease worker's salary");
            System.out.println("4. Display all workers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1: {
                    addWorker();
                    break;
                }
                case 2: {
                    increaseSalary();
                    break;
                }
                case 3: {
                    decreaseSalary();
                    break;
                }
                case 4:
                    workerService.displayWorkers();
                    break;
                case 5:
                    System.exit(0);

            }
        }while (choice !=0 );
    }

    public void addWorker(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter workplace: ");
        String workPlace = scanner.nextLine();
        Worker worker = new Worker(name, age, salary, workPlace);
        workerService.addWorker(worker);
        System.out.println("Add thanh cong");
    }

    private void increaseSalary() {
        System.out.print("Enter id up: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter amount to increase: ");
        double amount = scanner.nextDouble();
        workerService.upSalaryWorker(id, amount);
    }

    private void decreaseSalary() {
        System.out.print("Enter id down: ");
        int id = scanner.nextInt();
        System.out.print("Enter amount to decrease: ");
        double amount = scanner.nextDouble();
        workerService.downSalaryWorker(id, amount);
    }
}
