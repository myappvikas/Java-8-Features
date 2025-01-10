package org.myapp.java_8.features.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employees {

	public int eid;
	public String name;
	public Double salary;

	public Employees(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public Employees(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
//BiFunction all remaining operations are same like Function.
public class BiFunctionDemo {
	
	public static void main(String[] args) {

	List<Employees> list = new ArrayList<>();
	
	BiFunction<Integer, String, Employees> f = (eno, name) -> new Employees(eno, name);
	
	list.add(f.apply(101,"vikas"));
	list.add(f.apply(102,"deepak"));
	list.add(f.apply(103,"hariom"));
	list.add(f.apply(104,"charan"));
	
	for (Employees employee : list) {
		System.out.println("Employee Id: "+employee.eid);
		System.out.println("Employee Name: "+employee.name);
		System.out.println();
		
	}
	}
}
