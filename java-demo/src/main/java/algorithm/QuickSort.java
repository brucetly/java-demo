package algorithm;

public class QuickSort {

	public void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private void sort(int[] arr, int start, int end) {
		if (start < end) {
			int pivotPoint = insertionPoint(arr, start, end);
			sort(arr, start, pivotPoint-1);
			sort(arr, pivotPoint+1, end);
		}
	}
	
	private int insertionPoint(int[] arr, int start, int end) {
		int pivot = arr[end], j=start, temp;
		for (int i=start; i<end; i++) {
			if (arr[i] < pivot) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		temp = arr[j];
		arr[j] = arr[end];
		arr[end] = temp;
		return j;
	}
}
