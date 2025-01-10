package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MainTest {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(103, "vikas", 35, 500000d),
				new Employee(106, "deepak", 30, 300000d),
				new Employee(102, "ambrish", 28, 800000d),
				new Employee(107, "durga", 45, 100000d),
				new Employee(101, "mahesh", 25, 200000d)
				);

		//Employee class needs to be Comparable
		//list.stream().sorted(Comparator.reverseOrder())
		//.peek(System.out::println).collect(Collectors.toList());
		
		//Employee class needs to be Comparable
		//list.stream().sorted()
		//.peek(System.out::println).collect(Collectors.toList());
		
		//Valid
		//list.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary()))
		//.peek(System.out::println).collect(Collectors.toList());
		
		list.stream().sorted()
		.peek(System.out::println).collect(Collectors.toList());

		
		


	}
}
