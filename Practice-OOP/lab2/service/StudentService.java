package lab2.service;

import lab2.entities.Student;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students;

    public StudentService(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public void calculateStudent(){
        int totalStudent = students.size();
        if(totalStudent <= 0) {
            System.out.println("no student");
            return;
        }

        int countA = 0, countB = 0, countC= 0;
        for(Student student: students){
            switch (student.getGrade()){
                case "A": {
                    countA++;
                    break;
                }
                case "B": {
                    countB++;
                    break;
                }
                case "C": {
                    countC++;
                    break;
                }
            }
        }

        System.out.println("percent A: " + (countA / totalStudent)*100 + "%");
        System.out.println("percent B: " + (countB / totalStudent)*100 + "%");
        System.out.println("percent C: " + (countC / totalStudent)*100 + "%");
    }
}
