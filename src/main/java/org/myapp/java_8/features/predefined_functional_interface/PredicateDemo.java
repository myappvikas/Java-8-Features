package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		System.out.println("---------Wrapper---------------------------");
		Predicate<Integer> p = n -> n % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(15));

		System.out.println("---------String---------------------------");
		Predicate<String> p3 = s -> s.length() > 5;
		System.out.println(p3.test("uma"));

		System.out.println("---------Custome Object-----------------------------");
		Employee e = new Employee(100000l);
		Predicate<Employee> p2 = e1 -> e1.getSalary() > 5000l;
		System.out.println(p2.test(e));
	}
}