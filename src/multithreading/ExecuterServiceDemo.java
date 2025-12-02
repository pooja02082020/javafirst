package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceDemo {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newSingleThreadExecutor();
		//created single thread
		
		Callable<Integer>task = ()-> 10+20;
		Future<Integer> f = es.submit(task);

			System.out.println("Task executed "+ f.get());
			es.shutdown();
		}
	}

