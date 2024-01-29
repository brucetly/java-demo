package algorithm;

public class SlidingWindow {

	public int maxSum(int[] arr, int windowSize) {
		int windowSum = 0;
		for (int i=0; i<windowSize; i++) {
			windowSum += arr[i];
		}
		int max = windowSum;
		for (int i=windowSize; i<arr.length; i++) {
			windowSum += arr[i] - arr[i-windowSize];
			max = Math.max(max, windowSum);
		}
		return max;
	}

}
