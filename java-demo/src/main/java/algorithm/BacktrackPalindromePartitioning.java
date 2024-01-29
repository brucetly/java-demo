package algorithm;

import java.util.*;

public class BacktrackPalindromePartitioning {

	/*
	 * Given a string s, partition s such that every substring of the partition is a
	 * palindrome. Return all possible palindrome partitioning of s.
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 16 
	 * s contains only lowercase English letters.
	 */		
	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		backtrack(list, new Stack<String>(), s, 0);		
		return list;
	}

	private void backtrack(List<List<String>> list, Stack<String> stack, String s, int start) {
		if (start >= s.length()) {			
			list.add(new ArrayList<String>(stack));
		}
		for (int i=start; i<s.length(); i++) {
			String str = s.substring(start,i+1);
			if (isPalindrome(str) == false) continue;
			stack.push(str);
			backtrack(list, stack, s, i+1);
			stack.pop();
		}
	}
	
	private boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		return s.length() > 0 && s.equals(sb.reverse().toString());
	}
}
