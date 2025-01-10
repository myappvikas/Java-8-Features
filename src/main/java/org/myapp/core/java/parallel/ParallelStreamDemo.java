package org.myapp.core.java.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		//Stream demo 
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));

		//Parallel Stream demo
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
		
		//second approach
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.parallelStream().forEach(System.out::println);
	}
}
