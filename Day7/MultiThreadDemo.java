class NumberThread extends Thread {
    private String threadName;

    public NumberThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread("Thread 1");
        NumberThread thread2 = new NumberThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
