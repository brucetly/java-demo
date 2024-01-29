package algorithm;

import java.util.*;

public class BacktrackCombinationSum2 {

	/*
	 * Given a collection of candidate numbers (candidates) and a target number
	 * (target), find all unique combinations in candidates where the candidate
	 * numbers sum to target.
	 * 
	 * Each number in candidates may only be used once in the combination.
	 * 
	 * Note: The solution set must not contain duplicate combinations.
	 * 
	 * Constraints:
	 * 
	 * 1 <= candidates.length <= 100 
	 * 1 <= candidates[i] <= 50 
	 * 1 <= target <= 30
	 */		
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backtrack(list, new Stack<Integer>(), candidates, target, new boolean[candidates.length], 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] candidates, int target, boolean[] used, int sum) {
		List<Integer> temp = new ArrayList<Integer>(stack);
		Collections.sort(temp);
		if (sum == target && list.contains(temp) == false) {
			list.add(temp);
		}
		for (int i=0; i<candidates.length; i++) {
			if (used[i]) continue;
			stack.push(candidates[i]);
			used[i] = true;
			backtrack(list, stack, candidates, target, used, sum+candidates[i]);
			used[i] = false;
			stack.pop();
		}
	}

}
