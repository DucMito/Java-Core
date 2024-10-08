package extend_lesson_ass4;

public class Rectangle extends  Geometry{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void display(){
        System.out.println("Hinh chu nhat: ");
        System.out.println("Dien tich : " + calculateArea());
        System.out.println("Chu vi: " + calculatePerimeter());
    }


}
