package org.myapp.java_8.features.predefined_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiConsumerDemo {

	public static void main(String[] args) {

		List<Employees> l = new ArrayList<>();
		populate(l);
		BiConsumer<Employees, Double> c = (e, s) -> e.salary = e.salary + 500;
		for (Employees employees : l) {
			c.accept(employees, 500.0);
		}
		for (Employees employees : l) {
			System.out.println("Employee Name: "+employees.name);
			System.out.println("Employee Salary: " +employees.salary);
			System.out.println();
		}
	}

	private static void populate(List<Employees> l) {
		l.add(new Employees("durga", 1000d));
		l.add(new Employees("vikas", 2000d));
		l.add(new Employees("ram", 3000d));
		l.add(new Employees("syam", 5000d));
		l.add(new Employees("ghanshyam", 4000d));
	}
}
