package algorithm;

import java.util.*;

public class BacktrackCombinationSum {

	/*
	 * Given an array of distinct integers candidates and a target integer target,
	 * return a list of all unique combinations of candidates where the chosen
	 * numbers sum to target. You may return the combinations in any order.
	 * 
	 * The same number may be chosen from candidates an unlimited number of times.
	 * Two combinations are unique if the frequency of at least one of the chosen
	 * numbers is different.
	 * 
	 * The test cases are generated such that the number of unique combinations that
	 * sum up to target is less than 150 combinations for the given input.
	 * 
	 * Constraints:
	 * 
	 * 	1 <= candidates.length <= 30 
	 * 	2 <= candidates[i] <= 40 
	 * 	All elements of candidates are distinct. 
	 * 	1 <= target <= 40
	 */		
	public List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new Stack<Integer>(), nums, target, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] nums, int target, int sum) {
		List<Integer> temp = new ArrayList<Integer>(stack);
		Collections.sort(temp);;
		if (sum == target && list.contains(temp) == false) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		if (sum > target) {
			return;
		}
		for (int i=0; i<nums.length; i++) {
			stack.push(nums[i]);
			backtrack(list, stack, nums, target, sum+nums[i]);
			stack.pop();
		}
	}
}
