import java.util.Scanner;
class Interest {
    public void display(double principal, double rate, double time) {
        System.out.println("Calculating interest...");
    }
}
class SimpleInterest extends Interest {
    @Override
    public void display(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: Rs " + simpleInterest);
    }
}
class CompoundInterest extends Interest {
    @Override
    public void display(double principal, double rate, double time) {
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Compound Interest: Rs " + compoundInterest);
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount (Rs):");
        double principal = scanner.nextDouble();
        System.out.println("Enter the annual rate of interest (%):");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period (in years):");
        double time = scanner.nextDouble();
        System.out.println("Choose the type of interest to calculate:");
        System.out.println("1. Simple Interest\n2. Compound Interest");
        int choice = scanner.nextInt();
        Interest interest;
        if (choice == 1) {
            interest = new SimpleInterest();
        } else if (choice == 2) {
            interest = new CompoundInterest();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }
        interest.display(principal, rate, time);
        scanner.close();
    }
}
