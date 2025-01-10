package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		System.out.println("-----------Wrapper--------------------");
		Function<Integer, Integer> fun = n -> n * n;
		System.out.println(fun.apply(5));
		System.out.println(fun.apply(15));

		System.out.println("-------------String------------------");
		Function<String, Integer> fun1 = s -> s.length();
		System.out.println(fun1.apply("vikas"));
		System.out.println(fun1.apply("Uma"));

		System.out.println("---------------Custome Object----------------");
		Employee emp = new Employee(100000l);
		Function<Employee, Long> emp3 = e -> e.getSalary() + 50000l;
		System.out.println(emp3.apply(emp));

	}

}
