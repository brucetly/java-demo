package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlidingWindowTest {

	@Test
	void test() {
		int[] arr = {5,3,8,2,1,7,13,1,6,12};
		int windowSize = 3;
		SlidingWindow tester = new SlidingWindow();
		assertEquals(21, tester.maxSum(arr, windowSize));
	}

}
