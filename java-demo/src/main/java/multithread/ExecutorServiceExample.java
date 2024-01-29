package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {

	private int taskNumber;

	MyRunnable(int taskNumber) {
		this.taskNumber = taskNumber;
	}
	
	@Override
	public void run() {
        System.out.println(Thread.currentThread().getName()
                + " executing task no " + taskNumber);

        try {
        	Thread.sleep(1000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }		
	}
	
}

public class ExecutorServiceExample {

	private static int threadCount = 2;
	private static int taskCount = 10;
	
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(threadCount);
		System.out.println("executor created "+threadCount+" threads");
		
		System.out.println("2 threads in executor will be used for executing 10 tasks. "
                + "So, at a time only 2 tasks will be executed");
		for (int i=1; i<=taskCount; i++) {
			Runnable task = new MyRunnable(i);
			executor.execute(task);
		}
		
		executor.shutdown();
		System.out.println("executor has been shutDown.");
	}

}
