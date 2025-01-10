package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamToArrayEx {
	
	public static void main(String[] args) {
		
		List<Integer> intList = List.of(10,15,20,25,30);
		
		Integer[] intArray = intList.stream().toArray(Integer[]::new);
		
		for (Integer intValue : intArray) {
			System.out.println(intValue);
		}
		
		System.out.println("Conversion of List into array");
		Integer[] intArr = intList.stream().toArray(Integer[]::new);
		Stream.of(intArr).forEach(System.out::println);
	}

}
