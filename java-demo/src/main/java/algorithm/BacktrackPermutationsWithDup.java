package algorithm;

import java.util.*;

public class BacktrackPermutationsWithDup {

	/*
	 * Given an array nums of distinct integers, return all the possible
	 * permutations. You can return the answer in any order.
	 * 
	 * Constraints:
	 * 		1 <= nums.length <= 6 
	 * 		-10 <= nums[i] <= 10 
	 * 		All the integers of nums are unique.
	 */				
	public List<List<Integer>> permutations(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new Stack<Integer>(), nums, new boolean[nums.length]);
		return list;
	}

	private void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] nums, boolean[] used) {
		if (stack.size() == nums.length && list.contains(stack) == false) {
			list.add(new ArrayList<Integer>(stack));
			return;
		}
		for (int i=0; i<nums.length; i++) {
			if(used[i]) continue;
			stack.push(nums[i]);
			used[i] = true;
			backtrack(list, stack, nums, used);
			used[i] = false;
			stack.pop();
		}
	}

}
