package lab2;

import lab2.entities.Student;
import lab2.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.inputStudent();
        studentView.displayAllStudent();
        studentView.displayCalculate();
    }
}
