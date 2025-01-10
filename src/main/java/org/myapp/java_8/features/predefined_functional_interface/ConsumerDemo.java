package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		System.out.println("------------Wrapper--------------");
		Consumer<Integer> c = i -> System.out.println(i * i);
		c.accept(5);

		System.out.println("------------String--------------");
		Consumer<String> c1 = i -> System.out.println(i.length());
		c1.accept("vikas");

		System.out.println("-------------Custome Object-------------");
		Employee emp = new Employee(2000000l);

		Consumer<Employee> c2 = e -> System.out.println(e.getSalary());
		c2.accept(emp);
	}
}
