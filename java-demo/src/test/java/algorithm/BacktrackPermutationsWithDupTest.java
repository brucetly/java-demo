package algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class BacktrackPermutationsWithDupTest {

	@Test
	public void test1() {
		int[] nums = {1,1,2};
		BacktrackPermutationsWithDup backtrack = new BacktrackPermutationsWithDup();
		List<List<Integer>> list = backtrack.permutations(nums);
		assertEquals("[[1, 1, 2], [1, 2, 1], [2, 1, 1]]", list.toString());
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3};
		BacktrackPermutationsWithDup backtrack = new BacktrackPermutationsWithDup();
		List<List<Integer>> list = backtrack.permutations(nums);
		assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", list.toString());
	}
}
