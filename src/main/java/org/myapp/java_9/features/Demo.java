package org.myapp.java_9.features;

import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6,7,8,9).dropWhile(e->e%2==0).forEach(System.out::println);
		
	}
}
