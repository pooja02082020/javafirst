package multithreading;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }
}

public class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {

    	//Thread t1 = new Thread(new myThread1());
    	Thread t = new Thread(new MyThread1());
        t.start();
  
        System.out.println("Thread Running 0"+ t.isAlive());
        
        MyThread1 mt1 = new MyThread1();
        Thread t2 = new Thread(mt1);
        t2.start();
        
        System.out.println("Thread Running 1"+ t.isAlive());
    }
}
