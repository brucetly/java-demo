package algorithm;

import java.util.*;

public class BacktrackPermutations {

	/*
	 * Given an array nums of distinct integers, return all the possible
	 * permutations. You can return the answer in any order.
	 * 
	 * Constraints:
	 * 1 <= nums.length <= 6 
	 * -10 <= nums[i] <= 10 
	 * All the integers of nums are unique.
	 */ 
	public List<List<Integer>> permutations(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new Stack<Integer>(), nums);
		return list;
	}

	public void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] nums) {
		if (stack.size() == nums.length) {
			list.add(new ArrayList<Integer>(stack));
		}
		for (int i = 0; i < nums.length; i++) {
			if (stack.contains(nums[i]))
				continue;
			stack.push(nums[i]);
			backtrack(list, stack, nums);
			stack.pop();
		}
	}
}
