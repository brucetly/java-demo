package basic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class ComparatorNameTest {

	@Test
	void test() {
		Employee emp1 = new Employee(1, "beta");
		Employee emp2 = new Employee(2, "alpha");
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		assertEquals("[1:beta, 2:alpha]", list.toString());
		ComparatorName comparator = new ComparatorName();
		assertEquals(0, comparator.compare(emp1, emp1));
		assertEquals(1, comparator.compare(emp1, emp2));
		Collections.sort(list, comparator);
		assertEquals("[2:alpha, 1:beta]", list.toString());
	}

}
