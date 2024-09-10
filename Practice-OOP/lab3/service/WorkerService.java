package lab3.service;

import lab3.entities.Worker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WorkerService {
    private ArrayList<Worker> workers;
    /*private  Worker worker = new Worker();*/
    private Worker worker;

    public WorkerService(){
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public Worker findIdWorker(int idWorker){
        for(Worker worker: workers){
            if(worker.getId() == idWorker){
                return  worker;
            }
        }
        return null;
    }

    public void upSalaryWorker(int id, double amountUpdate){
        worker = findIdWorker(id);
        if(worker !=null){
            worker.setSalary(worker.getSalary() + amountUpdate);
            System.out.println("Update worker " + id);
        }else{
            System.out.println("Not found worker");
        }
    }


    public void downSalaryWorker(int id, double amountUpdate){
        worker = findIdWorker(id);
        if(worker != null){
            worker.setSalary(worker.getSalary() - amountUpdate);
            System.out.println("Update worker: " + id);
        }else{
            System.out.println("not found woker.");
        }
    }

    public void displayWorkers() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedNow = now.format(formatter);
        System.out.println("Date: " + formattedNow);
        if (workers.isEmpty()) {
            System.out.println("No workers available.");
        } else {
            for (Worker worker : workers) {
                System.out.println(worker);
            }
        }
    }
}
