package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemMapEx {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		intList.add(0);
		intList.add(5);
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);

		System.out.println(intList);

		List<Integer> list = intList.stream().map(i -> i + 5).collect(Collectors.toList());

		System.out.println(list);
	}

}
