import java.util.Scanner;

class CounterThread extends Thread {
    private int start;
    private int end;

    public CounterThread(String name, int start, int end) {
        super(name);  
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(5);  
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}
public class CounterProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter thread name: ");
        String threadName = scanner.nextLine();
        System.out.print("Enter start value: ");
        int start = scanner.nextInt();
        System.out.print("Enter end value: ");
        int end = scanner.nextInt();
        CounterThread counterThread = new CounterThread(threadName, start, end);
        counterThread.start();
        
        scanner.close();
    }
}
