package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;

class BacktrackPalindromePartitioningTest {

	@Test
	void test1() {
		String s = "aab";
		BacktrackPalindromePartitioning tester = new BacktrackPalindromePartitioning();
		List<List<String>> list = tester.partition(s);
		assertEquals("[[a, a, b], [aa, b]]", list.toString());
	}

	@Test
	void test2() {
		String s = "a";
		BacktrackPalindromePartitioning tester = new BacktrackPalindromePartitioning();
		List<List<String>> list = tester.partition(s);
		assertEquals("[[a]]", list.toString());
	}	

	@Test
	void test3() {
		String s = "aabba";
		BacktrackPalindromePartitioning tester = new BacktrackPalindromePartitioning();
		List<List<String>> list = tester.partition(s);
		assertEquals("[[a, a, b, b, a], [a, a, bb, a], [a, abba], [aa, b, b, a], [aa, bb, a]]", list.toString());
	}		
}
