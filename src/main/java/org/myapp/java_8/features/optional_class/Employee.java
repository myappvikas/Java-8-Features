package org.myapp.java_8.features.optional_class;

public class Employee {
	
	private Integer id;
	private String empName;
	
	public Employee(Integer id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	
	public Integer getId() {
		return id;
	}
	public String getEmpName() {
		return empName;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}
}
