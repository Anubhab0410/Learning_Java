import java.util.Scanner;
public class StudentGrade {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the marks secured in Chemistry (out of 100): ");
int marks = scanner.nextInt();
String grade;
if (marks >= 90) {
System.out.println("A- Excellent");
} 
else if (marks >= 80 && marks <90) {
System.out.println("B-Very Good");
} 
else if (marks >= 70 && marks<80) {
System.out.println("C-Good");
} 
else if (marks >= 60 && marks<70) {
System.out.println("D-Satisfactory");
} 
else if (marks >= 50 && marks<60) {
System.out.println("E-Work Hard");
} 
else if (marks >= 40 && marks<50) {
System.out.println("F-Just Passed");
} 
else {
System.out.println("Failed");
}
scanner.close();
}
}
