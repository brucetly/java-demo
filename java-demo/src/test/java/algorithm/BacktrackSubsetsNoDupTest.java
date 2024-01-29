package algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BacktrackSubsetsNoDupTest {

	@Test
	public void test1() {
		int[] nums = {1,2,2};
		BacktrackSubsetsNoDup backtrack = new BacktrackSubsetsNoDup();
		List<List<Integer>> list = backtrack.subsets(nums);
		assertEquals("[[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]", list.toString());
	}

	@Test
	public void test2() {
		int[] nums = {0};
		BacktrackSubsetsNoDup backtrack = new BacktrackSubsetsNoDup();
		List<List<Integer>> list = backtrack.subsets(nums);
		assertEquals("[[], [0]]", list.toString());
	}
}
