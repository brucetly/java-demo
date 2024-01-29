package algorithm;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

public class BacktrackSubsets {

	/*
	 * Given an integer array nums of unique elements, return all possible subsets
	 * (the power set).
	 * 
	 * The solution set must not contain duplicate subsets. Return the solution in
	 * any order.
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 10 -10 <= nums[i] <= 10 All the numbers of nums are
	 * unique.
	 */		
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new Stack<Integer>(), nums, 0);
		return list;
	}
	
	private void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] nums, int start) {
		list.add(new ArrayList<Integer>(stack));
		for (int i=start; i<nums.length; i++) {
			stack.push(nums[i]);
			backtrack(list, stack, nums, i+1);
			stack.pop();
		}
	}

}
