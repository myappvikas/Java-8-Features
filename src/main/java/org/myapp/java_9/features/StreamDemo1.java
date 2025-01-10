package org.myapp.java_9.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {

		// takeWhile(Predicate) and dropWhile(Predicate) examples.

		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);

		
		  System.out.println("----------------------------");
		  
		  List<Integer> list2 = Stream.of(2, 2, 12, 4, 5, 6, 7, 8, 9, 10).takeWhile(i
		  -> (i % 2 == 0)) .collect(Collectors.toList()); System.out.println(list2);
		  
		  System.out.println("------------------------------");
		  
		  List<Integer> list3 = Stream.of(2, 2, 12, 4, 5, 6, 7, 8, 9, 10).dropWhile(i
		  -> (i % 2 == 0)) .collect(Collectors.toList()); System.out.println(list3);
	}
}
