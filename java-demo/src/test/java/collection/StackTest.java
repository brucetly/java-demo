package collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void test() {
		Stack stack = new Stack();
		
		stack.enQueue(1);
		stack.enQueue(3);
		stack.enQueue(2);
		
		assertEquals(3, stack.size());
		assertEquals(1, stack.deQueue());
		assertEquals(2, stack.size());
		assertEquals(3, stack.deQueue());
		assertEquals(1, stack.size());
		assertEquals(2, stack.deQueue());
		assertEquals(0, stack.size());
	}

}
