package lesson3_student.service;

import lesson3_student.entities.Student;

public class StudentService implements IClassification{
    public Student student;
    public StudentService(Student student){
        /*student = new Student(student.getName(), student.getAge(), student.getMarks());*/
        this.student = student;
    }
    @Override
    public void classify() {
        double inputMark = student.getMarks();
        if (inputMark >= 8) {
            student.setClassification("A");
        } else if (inputMark > 6.5) {
            student.setClassification("B");
        } else {
            student.setClassification("C");
        }
    }

    @Override
    public void display() {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Classification: " + student.getClassification());
    }
}
