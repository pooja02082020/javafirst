package multithreading;

class Printer {
    int num = 1;

    public synchronized void printOdd() throws InterruptedException {
        while (num <= 10) {
            while (num % 2 == 0) {
                wait();   // wait if number is even
            }
            System.out.println("Odd " + num++);
            notify();     // wake even thread
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= 10) {
            while (num % 2 != 0) {
                wait();   // wait if number is odd
            }
            System.out.println("Even " + num++);
            notify();     // wake odd thread
        }
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {
        Printer pr = new Printer();

        new Thread(() -> {
            try {
                pr.printOdd();
            } catch (Exception e) { }
        }).start();

        new Thread(() -> {
            try {
                pr.printEven();
            } catch (Exception e) { }
        }).start();
    }
}
