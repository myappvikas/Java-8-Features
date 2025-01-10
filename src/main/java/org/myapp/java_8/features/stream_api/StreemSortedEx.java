package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreemSortedEx {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();

		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		marks.add(25);

		System.out.println(marks);

		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

		Set<Integer> sortedSet = marks.stream().sorted().collect(Collectors.toSet());

		System.out.println(sortedSet);
	}

}
