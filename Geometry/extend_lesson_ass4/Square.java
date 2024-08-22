package extend_lesson_ass4;

public class Square extends Geometry{
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public void display() {
        System.out.println("Hình vuông:");
        System.out.println("Cạnh: " + side);
        System.out.println("Diện tích: " + calculateArea());
        System.out.println("Chu vi: " + calculatePerimeter());
    }
}
