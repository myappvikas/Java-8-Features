package org.myapp.java_8.features.sorting;

class Employee implements Comparable<Employee>{

	public Integer id;
	public String name;
	public Integer age;
	private Double salary;

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.getSalary().compareTo(emp.getSalary());
	}	
}
