package org.myapp.java_9.features;

import java.util.stream.Stream;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.ofNullable("vikas");
		Stream<String> s2 = Stream.ofNullable(null);
		System.out.println(s1.count());
		System.out.println(s2.count());
		
		System.out.println("-----------------------");
		
		Stream<Integer> s3 = Stream.ofNullable(1000);
		Stream<Integer> s4 = Stream.ofNullable(null);
		System.out.println(s3.count());
		System.out.println(s4.count());

	}

}
