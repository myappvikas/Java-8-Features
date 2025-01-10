package org.myapp.java_9.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Stream.concat(list.stream().filter(e -> e % 2 == 0), list.stream().map(e -> e + 100))
				.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> stream = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(stream);

	}

}
