package algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BacktrackCombinationSumTest {

	@Test
	public void test() {
		int[] nums = {2,3,6,7};
		int target = 7;
		BacktrackCombinationSum backtrack = new BacktrackCombinationSum();
		List<List<Integer>> list = backtrack.combinationSum(nums, target);
		assertEquals("[[2, 2, 3], [7]]", list.toString());
	}

	@Test
	public void test2() {
		int[] nums = {2,3,5};
		int target = 8;
		BacktrackCombinationSum backtrack = new BacktrackCombinationSum();
		List<List<Integer>> list = backtrack.combinationSum(nums, target);
		System.out.println(list);
		assertEquals("[[2, 2, 2, 2], [2, 3, 3], [3, 5]]", list.toString());
	}

	@Test
	public void test3() {
		int[] nums = {2};
		int target = 1;
		BacktrackCombinationSum backtrack = new BacktrackCombinationSum();
		List<List<Integer>> list = backtrack.combinationSum(nums, target);
		assertEquals("[]", list.toString());
	}	
}
