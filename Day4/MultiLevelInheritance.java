class Plate {
    private double length;
    private double width;
    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor executed.");
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}

class Box extends Plate {
    private double height;
    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor executed.");
    }
    public double getHeight() {
        return height;
    }
}
class WoodBox extends Box {
    private double thickness;
    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor executed.");
    }
    public double getThickness() {
        return thickness;
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Creating a WoodBox object:");
        WoodBox woodBox = new WoodBox(10, 5, 8, 0.5);
        System.out.println("\nDetails of the WoodBox:");
        System.out.println("Length: " + woodBox.getLength());
        System.out.println("Width: " + woodBox.getWidth());
        System.out.println("Height: " + woodBox.getHeight());
        System.out.println("Thickness: " + woodBox.getThickness());
    }
}
