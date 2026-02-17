import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;
    public void readDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
    }
    public double calculateArea() {
        return length * breadth;
    }
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rectangle = new Rectangle();
        rectangle.readDimensions();
        rectangle.display();
    }
}
