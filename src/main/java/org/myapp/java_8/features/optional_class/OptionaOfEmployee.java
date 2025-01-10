package org.myapp.java_8.features.optional_class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionaOfEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(101, "vikas"),
				new Employee(102, "deepak"),
				new Employee(103, "ambrish")
				);
		
		Optional<Employee> emp = Optional.ofNullable(list.get(0));
		
		System.out.println(emp);
		System.out.println(emp.get());
		
		if(emp.isPresent())
			System.out.println("employee is available");
		
		Optional<Employee> emp2 = Optional.of(list.get(0));
		System.out.println(emp2.isEmpty());	
	}
}
