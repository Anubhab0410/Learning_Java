import java.util.Scanner;
abstract class Student {
    int rollNo;
    int regNo;
    Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course(String subject);
    abstract void branch(String branchName);
}

class Generic extends Student {
    Generic(int rollNo, int regNo) {
        super(rollNo, regNo);
    }
    @Override
    void course(String subject) {
        System.out.println("Subject Chosen: " + subject);
    }
    @Override
    void branch(String branchName) {
        System.out.println("Branch: " + branchName);
        switch (branchName.toLowerCase()) {
            case "computer science":
                System.out.println("Focuses on programming, algorithms, and software development.");
                break;
            case "electrical engineering":
                System.out.println("Focuses on circuits, electronics, and power systems.");
                break;
            case "mechanical engineering":
                System.out.println("Focuses on machines, thermodynamics, and manufacturing.");
                break;
            case "chemical engineering":
                System.out.println("Focuses on chemical reactions, process engineering, and materials.");
                break;
            case "civil engineering":
                System.out.println("Focuses on construction, structural design, and geotechnical engineering.");
                break;
            default:
                System.out.println("Invalid branch entered!");
        }
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Registration Number: ");
        int regNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String subject = scanner.nextLine();
        Generic student = new Generic(rollNo, regNo);
        student.branch(branchName);
        student.course(subject);

        scanner.close();
    }
}
