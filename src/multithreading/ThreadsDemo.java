package multithreading;

class MyThread extends Thread {

	public void run() {
		System.out.println("Thread  Running" + Thread.currentThread().getName());
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		MyThread mt1 = new MyThread();
		mt1.start();
	//start() method will cal the run method
	}

}
