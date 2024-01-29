package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchDemoTest {

	@Test
	void test() {
		assertEquals("hello", SwitchDemo.test("a"));
		assertEquals("bye", SwitchDemo.test("c"));
		assertEquals("bye", SwitchDemo.test("g"));
		assertEquals("hello you", SwitchDemo.test("you"));
	}

}
