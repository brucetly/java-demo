package multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		System.out.println("My Runnable's run");
	}
	
}

public class SubmitRunnableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> futureInteger = executor.submit(new MyRunnable2(), 2);
		System.out.println("futureInteger.get() > "+futureInteger.get());
		
	    Future<?> future=executor.submit(new MyRunnable2());
	    System.out.println("future.get() > "+future.get());		
	}

}
