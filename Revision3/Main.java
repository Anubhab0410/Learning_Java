import java.util.Scanner;  
interface Operation {  
double calculate(double x, double y);  
}  
class HypotenuseCalculator implements Operation {  
@Override  
public double calculate(double x, double y) {  
return Math.sqrt(x * x + y * y);  
}  
}  
public class Main {  
public static void main(String[] args) {  
Scanner scanner = new Scanner(System.in);  
System.out.print("Base: ");  
double base = scanner.nextDouble();  
System.out.print("Height: ");  
double height = scanner.nextDouble();  
Operation calculator = new HypotenuseCalculator();  
double hypotenuse = calculator.calculate(base, height);  
System.out.println("Hypotenuse: " + hypotenuse);  
scanner.close();  
}  
}  