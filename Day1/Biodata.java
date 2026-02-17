import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for User:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Roll No: ");
        int rollNo1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Section: ");
        String section1 = scanner.nextLine();
        System.out.print("Branch: ");
        String branch1 = scanner.nextLine();
 System.out.println("Enter details for User 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Roll No: ");
        int rollNo2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Section: ");
        String section2 = scanner.nextLine();
        System.out.print("Branch: ");
        String branch2 = scanner.nextLine();
 System.out.println("Enter details for User 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Roll No: ");
        int rollNo3 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Section: ");
        String section3 = scanner.nextLine();
        System.out.print("Branch: ");
        String branch3 = scanner.nextLine();
        System.out.println("\nDetails of Users:");
        System.out.println("User 1: Name = " + name1 + ", Roll No = " + rollNo1 + ", Section = " + section1 + ", Branch = " + branch1);
        System.out.println("User 2: Name = " + name2 + ", Roll No = " + rollNo2 + ", Section = " + section2 + ", Branch = " + branch2);
        System.out.println("User 3: Name = " + name3 + ", Roll No = " + rollNo3 + ", Section = " + section3 + ", Branch = " + branch3);


        scanner.close();
    }
}
