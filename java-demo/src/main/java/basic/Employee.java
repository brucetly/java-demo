package basic;

import java.util.Comparator;

public class Employee implements Comparable {
	private Integer id;
	private String name;
	
	static class ComparatorName implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Employee employee = (Employee)obj;
		return 	(this.id == employee.id || this.id.equals(employee.id)) && 
				(this.name == employee.name || this.name.equals(employee.name));
	}
	
	@Override
	public int hashCode() {
		return 	id == null ? 0 : id.hashCode() + 
				name == null ? 0 : name.hashCode();
	}
	
	@Override
	public int compareTo(Object o) {
		return this.id - ((Employee)o).id;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return id+":"+name;
	}
}
