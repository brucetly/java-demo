package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class BacktrackCombinationSum2Test {

	@Test
	void test1() {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		BacktrackCombinationSum2 backtrack = new BacktrackCombinationSum2();
		List<List<Integer>> list = backtrack.combinationSum(candidates, target);
		assertEquals("[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]", list.toString());
	}

	@Test
	void test2() {
		int[] candidates = {2,5,2,1,2};
		int target = 5;
		BacktrackCombinationSum2 backtrack = new BacktrackCombinationSum2();
		List<List<Integer>> list = backtrack.combinationSum(candidates, target);
		assertEquals("[[1, 2, 2], [5]]", list.toString());
	}

}
