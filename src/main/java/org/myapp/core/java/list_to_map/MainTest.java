package org.myapp.core.java.list_to_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1,"Vikas",32),
				new Employee(2,"Deepak",22),
				new Employee(3,"Uma",50)
				);
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
		map.forEach((e1,e2)->System.out.println(e1+" "+": "+e2));
	}
}
