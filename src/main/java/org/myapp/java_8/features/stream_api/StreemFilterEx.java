package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreemFilterEx {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		intList.add(0);
		intList.add(15);
		intList.add(10);
		intList.add(5);
		intList.add(20);
		intList.add(25);
		
		System.out.println(intList);

		intList.stream().filter(i -> i % 2 == 0)
				.peek(System.out::println).collect(Collectors.toList());
		
		intList.stream().filter(i -> i % 2 != 0)
				.peek(System.out::println).collect(Collectors.toList());
		
		
		intList.stream().filter(i -> i % 2 == 1)
				.peek(System.out::println).collect(Collectors.toList());
		
	}

}
