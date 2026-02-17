import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberProcessor {
    
    public static void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Error: Negative numbers are not allowed!");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        try {
            processInput(num);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
