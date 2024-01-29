package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {

	@Test
	public void shouldSortArray() {
		int[] arr = {7,2,9,3,8,2,1};
		MergeSort tester = new MergeSort();
		tester.sort(arr);
		assertArrayEquals(new int[]{1,2,2,3,7,8,9}, arr);
	}

	@Test
	public void shouldHandleEmptyArray() {
		int[] arr = {};
		MergeSort tester = new MergeSort();
		tester.sort(arr);
		assertArrayEquals(new int[]{}, arr);
	}

}
