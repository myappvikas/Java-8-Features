package org.myapp.java_8.features.predefined_functional_interface;

public class Employee {
	
	private long salary;

	public Employee(long salary) {
		super();
		this.salary = salary;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
}
