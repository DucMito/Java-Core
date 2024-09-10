package lab1;

import lab1.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.inputStudents();
        studentView.displayStudents();
    }
}
