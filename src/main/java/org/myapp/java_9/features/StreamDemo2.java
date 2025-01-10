package org.myapp.java_9.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		System.out.println("from java 8");
		List<Integer> list = Stream.iterate(1, i -> i + 1).limit(10).peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println(list);

		System.out.println("Java 9");
		List<Integer> list1 = Stream.iterate(1, e -> e < 11, i -> i + 1)
				.peek(System.out::println).collect(Collectors.toList());

		System.out.println(list1);
	}
}
