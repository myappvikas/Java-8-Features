package org.myapp.collection.framework.set;

public class Employee {
	
	private String id;
	private String name;
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode method");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method");
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
