import java.util.Scanner;
class InvalidInputNumberException extends Exception {
    public InvalidInputNumberException(String message) {
        super(message);
    }
}
class NumberProcessor {
    public void meth(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        System.out.println("Sum of factorials of digits: " + sum);
    }
    private int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public void meth(int num, boolean isFibonacci) {
        if (isFibonacci) {
            int a = num, b = num + 1;
            System.out.print("Fibonacci Series: " + a + " " + b + " ");
            for (int i = 0; i < 8; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
    public void meth(int num, boolean isFibonacci, boolean isGeometric) {
        if (isGeometric) {
            System.out.print("Geometric Progression: " + num);
            int value = num;
            for (int i = 0; i < 7; i++) {
                value *= 3;
                System.out.print(" " + value);
            }
            System.out.println();
        }
    }
}

class AdvancedProcessor extends NumberProcessor {
    @Override
    public void meth(int num) {
        if (isPalindrome(num)) {
            System.out.println("Palindrome spotted: " + num);
        }
        if (isPrime(num)) {
            System.out.println("Prime number spotted: " + num);
        }
    }
    private boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedProcessor processor = new AdvancedProcessor();

        try {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();
            
            if (num <= 0) {
                throw new InvalidInputNumberException("Invalid input number exception");
            }
            processor.meth(num);
            processor.meth(num, true);
            processor.meth(num, true, true);

        } catch (InvalidInputNumberException e) {
            System.out.println(formatExceptionMessage(e.getMessage()));
        } catch (Exception e) {
            System.out.println("Invalid input! ");
        } finally {
            scanner.close();
        }

        System.out.println("Program execution done.");
    }
    private static String formatExceptionMessage(String message) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]); 
            } else {
                chars[i] = Character.toLowerCase(chars[i]); 
            }
        }
        return new String(chars);
    }
}
