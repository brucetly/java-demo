package multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumIntegerCallable implements Callable {

	Integer number;
	
	SumIntegerCallable(Integer n) {
		number = n;
	}
	
	@Override
	public Integer call() throws Exception {
		Integer sum = 0;
		for (int i=0; i<=number; i++) {
			sum += i;
		}
		return sum;
	}
}

class SquareDoubleCallable implements Callable {

	Double number;
	
	SquareDoubleCallable(Double n) {
		number = n;
	}
	
	@Override
	public Double call() throws Exception {
		return number * number;
	}
}


public class CallableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> futureInteger = executor.submit(new SumIntegerCallable(4));
		Future<Double> futureDouble = executor.submit(new SquareDoubleCallable(2.2));
		
		System.out.println("SumIntegerCallable has returned > "+futureInteger.get());
	    System.out.println("SquareDoubleCallable has returned > "+futureDouble.get());
	    
	    executor.shutdown();
	}

}
