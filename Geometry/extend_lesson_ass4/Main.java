package extend_lesson_ass4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width;
        do {
            System.out.println("Dai: ");
            length = Double.parseDouble(scanner.nextLine());
            System.out.println("Rong: ");
            width = Double.parseDouble(scanner.nextLine());
            if (length <= 0 || width <= 0) {
                System.out.println("Nhap lon hon 0.");
            }
        } while (length <= 0 || width <= 0);
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Hình chữ nhật:");
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + rectangle.calculateArea());
        System.out.println("Chu vi: " + rectangle.calculatePerimeter());

        double side;
        do {
            System.out.println("Canh hv: ");
            side = Double.parseDouble(scanner.nextLine());

            if (side <= 0) {
                System.out.println("Nha[ lon hon 0.");
            }
        } while (side <= 0);
        Square square = new Square(side);
        System.out.println("Hình vuông:");
        System.out.println("Cạnh: " + side);
        System.out.println("Diện tích: " + square.calculateArea());
        System.out.println("Chu vi: " + square.calculatePerimeter());
        System.exit(0);
    }
}
