package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemMapEx2 {

	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();

		listOfString.add("AAA");
		listOfString.add("A");
		listOfString.add("AA");
		listOfString.add("AAAAA");
		listOfString.add("AAAA");
		
		System.out.println(listOfString);

		List<String> list = listOfString.stream().map(i -> i + "Z").collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> lengthOfString = listOfString.stream().map(i -> i.length()).collect(Collectors.toList());
		System.out.println(lengthOfString);
	}

}
