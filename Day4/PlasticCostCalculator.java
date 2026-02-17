import java.util.Scanner;
class TwoD {
    protected double length;
    protected double width;

    public TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculateCost() {
        double area = calculateArea();
        return area * 40; // Rs 40 per square foot
    }
}
class ThreeD extends TwoD {
    private double height;

    public ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public double calculateVolume() {
        return length * width * height;
    }
    @Override
    public double calculateCost() {
        double volume = calculateVolume();
        return volume * 60; // Rs 60 per cubic foot
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of plastic (2D or 3D):");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("2D")) {
            System.out.println("Enter the length of the sheet (in feet):");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the sheet (in feet):");
            double width = scanner.nextDouble();

            TwoD sheet = new TwoD(length, width);
            double cost = sheet.calculateCost();
            System.out.println("The cost of the 2D sheet is: Rs " + cost);

        } else if (type.equalsIgnoreCase("3D")) {
            System.out.println("Enter the length of the box (in feet):");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the box (in feet):");
            double width = scanner.nextDouble();

            System.out.println("Enter the height of the box (in feet):");
            double height = scanner.nextDouble();

            ThreeD box = new ThreeD(length, width, height);
            double cost = box.calculateCost();
            System.out.println("The cost of the 3D box is: Rs " + cost);

        } else {
            System.out.println("Invalid input. Please enter either '2D' or '3D'.");
        }

        scanner.close();
    }
}
