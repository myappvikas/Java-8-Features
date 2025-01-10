package org.myapp.core.java.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateDemo {
	
	public static void main(String[] args) {
		
		List<String> listOne = List.of("A", "B");
		List<String> listTwo = List.of("C", "D");

		// Concatenate the lists
		List<String> newList = Stream.concat(listOne.stream(), listTwo.stream()).collect(Collectors.toList());
		System.out.println(newList);
	}
}
