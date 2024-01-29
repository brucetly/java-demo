package algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BacktrackPermutationsTest {

	@Test
	public void test1() {
		int[] nums = {1,2,3};
		BacktrackPermutations backtrack = new BacktrackPermutations();
		List<List<Integer>> list = backtrack.permutations(nums);
		assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", list.toString());
	}

	@Test
	public void test2() {
		int[] nums = {0,1};
		BacktrackPermutations backtrack = new BacktrackPermutations();
		List<List<Integer>> list = backtrack.permutations(nums);
		assertEquals("[[0, 1], [1, 0]]", list.toString());
	}


	@Test
	public void test3() {
		int[] nums = {1};
		BacktrackPermutations backtrack = new BacktrackPermutations();
		List<List<Integer>> list = backtrack.permutations(nums);
		assertEquals("[[1]]", list.toString());
	}
}
