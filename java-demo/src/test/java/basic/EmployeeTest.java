package basic;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;


class EmployeeTest {

	@Test
	void test1() {
		Employee emp1 = new Employee(1, "john");
		Employee emp2 = new Employee(1, "john");
		Employee emp3 = new Employee(2, "john");
		
		assertEquals(emp1, emp2);
		assertNotEquals(emp1, emp3);
	}

	@Test
	void test2() {
		Employee emp1 = new Employee(1, "john");
		Employee emp2 = new Employee(1, "john");
		Employee emp3 = new Employee(2, "john");
		
		assertEquals(0, emp1.compareTo(emp2));
		assertNotEquals(1, emp1.compareTo(emp3));
	}

	@Test
	void test3() {
		Employee emp1 = new Employee(1, "beta");
		Employee emp2 = new Employee(2, "alpha");
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		assertEquals("[1:beta, 2:alpha]", list.toString());
		Collections.sort(list, new Employee.ComparatorName());
		assertEquals("[2:alpha, 1:beta]", list.toString());
	}
}
