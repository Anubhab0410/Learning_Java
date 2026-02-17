import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter three numbers:");
if (scanner.hasNextInt()) {
int num1 = scanner.nextInt();
if (scanner.hasNextInt()) {
int num2 = scanner.nextInt();
if (scanner.hasNextInt()) {
int num3 = scanner.nextInt();
int largest = num1;
if (num2 > largest) {
largest = num2;
}
if (num3 > largest) {
largest = num3;
}
System.out.println("The largest number among the input integers is: " + largest);
} else {
System.out.println("Enter valid integer inputs.");
}} else {
System.out.println("Enter valid integer inputs.");
}} else {
System.out.println("Enter valid integer inputs.");
}
scanner.close();
}}
