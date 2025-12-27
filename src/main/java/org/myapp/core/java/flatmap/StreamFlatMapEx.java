package org.myapp.core.java.flatmap;

import java.util.Arrays;
import java.util.List;

/*
The flatMap() method in Java 8 Streams is used to flatten a stream
of collections or nested structures into a single stream of elements.
It is particularly useful when each element in the stream results in another
stream (e.g., a List<String>), and you want to flatten it into one continuous stream.
*/

public class StreamFlatMapEx {

	public static void main(String[] args) {
		
		List<List<Integer>> lists = Arrays.asList(
		Arrays.asList(1,2),
		Arrays.asList(3,4),
		Arrays.asList(5,6),
		Arrays.asList(7,8),
		Arrays.asList(9,10)
		);
		
		lists.stream()
				.flatMap(List::stream)
				.forEach(System.out::println);
	}
}
