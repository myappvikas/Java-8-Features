package org.myapp.core.java.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
A parallel stream is a stream that divides its elements into multiple chunks and processes
 them in parallel using the Fork/Join framework (introduced in Java 7).
It’s part of the Streams API (Java 8+).Helps in parallel processing of large datasets →
better performance in multi-core CPUs.
*/

public class ParallelStreamDemo {

	public static void main(String[] args) {

        //Ways 1.
		List<String> list = Arrays.asList("A", "B", "C", "D");
		list.parallelStream().forEach(System.out::println);
		//Ways 2.
		list.stream().parallel().forEach(System.out::println);
	}
}
