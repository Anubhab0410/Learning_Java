class NumberPrinter implements Runnable {
    private int start;
    private int step;
    private String threadName;

    // Constructor to initialize thread details
    public NumberPrinter(String name, int start, int step) {
        this.threadName = name;
        this.start = start;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = start; i <= 10; i += step) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Delay for better visibility
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        // Create Runnable instances for even and odd numbers
        Runnable evenRunnable = new NumberPrinter("Even Thread", 2, 2);
        Runnable oddRunnable = new NumberPrinter("Odd Thread", 1, 2);

        // Create and start threads
        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();
    }
}
