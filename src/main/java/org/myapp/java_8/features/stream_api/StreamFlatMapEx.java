package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapEx {

	public static void main(String[] args) {

		List<List<Integer>> listOfList = new ArrayList<>();

		listOfList.add(Arrays.asList(1, 2));
		listOfList.add(Arrays.asList(3, 4));
		listOfList.add(Arrays.asList(5, 6));
		listOfList.add(Arrays.asList(7, 8));
		listOfList.add(Arrays.asList(9, 10));

		System.out.println(listOfList);

		List<Integer> resultantList = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(resultantList);
		
		resultantList.forEach(System.out::println);
		
		resultantList.forEach(e -> System.out.println(e));
		
		System.out.println("ResultantList: "+resultantList);
	}

}
