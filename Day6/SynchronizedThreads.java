class SharedPrinter {
    synchronized void printWords(String threadName, String[] words) {
        for (String word : words) {
            System.out.println(threadName + ": " + word);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

class WordThread extends Thread {
    private SharedPrinter printer;
    private String threadName;
    private String[] words;

    public WordThread(SharedPrinter printer, String threadName, String[] words) {
        this.printer = printer;
        this.threadName = threadName;
        this.words = words;
    }

    @Override
    public void run() {
        printer.printWords(threadName, words);
    }
}

public class SynchronizedThreads {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        String[] words = {"I", "Love", "Java", "Very", "Much"};

        WordThread thread1 = new WordThread(printer, "Thread 1", words);
        WordThread thread2 = new WordThread(printer, "Thread 2", words);

        thread1.start();
        thread2.start();
    }
}
