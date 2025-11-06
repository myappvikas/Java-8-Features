package org.myapp.core.java.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Stream.concat() is a static method in the Stream class.
It is used to combine (concatenate) two streams into one.
The resulting stream contains all elements of the first stream
followed by all elements of the second stream.
*/

public class ConcatDemo {
	
	public static void main(String[] args) {
		
		List<String> listOne = List.of("A", "B");
		List<String> listTwo = List.of("C", "D");

		// Concatenate the lists
		List<String> newList = Stream.concat(listOne.stream(), listTwo.stream())
				.collect(Collectors.toList());
		System.out.println(newList);
	}
}
