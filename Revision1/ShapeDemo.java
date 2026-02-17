abstract class Shape {
    abstract double calculateArea();
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}
class Circle extends Shape {
    double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; 
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;   
  }
}
class Triangle extends Shape {
    double base;
    double height;
    public void setDimensions(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height; 
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        circle.setRadius(5);
        rectangle.setDimensions(4, 6);
        triangle.setDimensions(4, 7); 
        System.out.println("Circle:");
        circle.displayArea();
        System.out.println("Rectangle:");
        rectangle.displayArea();
        System.out.println("Triangle:");
        triangle.displayArea();
    }
}




