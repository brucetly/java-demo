package collection;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class HashMapTest {

	Map<String,Employee> map;
	
	@BeforeEach
	public void SetUp() {
		map = new HashMap<String,Employee>();
		map.put("b", new Employee(3,"John"));
		map.put("c", new Employee(1,"Albert"));
		map.put("a", new Employee(2,"Mary"));		
	}
	
	@Test
	public void shouldSortMapById() {
		List<Entry<String,Employee>> list = map.entrySet().stream().sorted((e1,e2) -> e1.getValue().id - e2.getValue().id).toList();
		assertEquals(1, list.get(0).getValue().id);
		assertEquals(2, list.get(1).getValue().id);
		assertEquals(3, list.get(2).getValue().id);
	}
	
	@Test
	public void shouldSortMapByName() {
		List<Entry<String,Employee>> list = map.entrySet().stream().sorted((e1,e2) -> e1.getValue().name.compareTo(e2.getValue().name)).toList();
		assertEquals("Albert", list.get(0).getValue().name);
		assertEquals("John", list.get(1).getValue().name);
		assertEquals("Mary", list.get(2).getValue().name);
	}
	
	@Test
	public void shouldSortMapByKey() {
		List<Entry<String,Employee>> list = map.entrySet().stream().sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey())).toList();
		assertEquals("a", list.get(0).getKey());
		assertEquals("b", list.get(1).getKey());
		assertEquals("c", list.get(2).getKey());
	}
	
	@Test
	public void shouldSortMapByKey2() {
		List<Entry<String,Employee>> list = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).toList();
		assertEquals("a", list.get(0).getKey());
		assertEquals("b", list.get(1).getKey());
		assertEquals("c", list.get(2).getKey());
	}
}
