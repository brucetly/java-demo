package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BacktrackSubsetsNoDup {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new Stack<Integer>(), nums, 0);
		return list;
	}
	
	private void backtrack(List<List<Integer>> list, Stack<Integer> stack, int[] nums, int start) {
		list.add(new ArrayList<Integer>(stack));
		for (int i=start; i<nums.length; i++) {
			if (i > start && nums[i] == nums[i-1]) continue;
			stack.push(nums[i]);
			backtrack(list, stack, nums, i+1);
			stack.pop();
		}
	}
}
