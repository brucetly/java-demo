package algorithm;

public class MergeSort {

	public void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private void sort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	private void merge(int[] arr, int start, int mid, int end) {
		int i=start, j=mid+1, k=0, temp;
		int[] localArr = new int[end-start+1];
		while (i<=mid || j<=end) {
			if (i<=mid && j<=end) {
				if (arr[i] < arr[j]) {
					localArr[k] = arr[i];
					i++;
				}
				else {
					localArr[k] = arr[j];
					j++;
				}
			}
			else if (i<=mid) {
				localArr[k] = arr[i];
				i++;
			}
			else {
				localArr[k] = arr[j];
				j++;
			}
			k++;
		}
		for (i=0; i<localArr.length; i++) {
			arr[start+i] = localArr[i];
		}
	}
	
}
