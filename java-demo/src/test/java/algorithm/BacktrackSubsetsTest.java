package algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BacktrackSubsetsTest {

	@Test
	public void test1() {
		int[] nums = {1,3,2};
		BacktrackSubsets backtrack = new BacktrackSubsets();
		List<List<Integer>> list = backtrack.subsets(nums);
		assertEquals("[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]", list.toString());
	}

	@Test
	public void test2() {
		int[] nums = {0};
		BacktrackSubsets backtrack = new BacktrackSubsets();
		List<List<Integer>> list = backtrack.subsets(nums);
		assertEquals("[[], [0]]", list.toString());
	}
}
