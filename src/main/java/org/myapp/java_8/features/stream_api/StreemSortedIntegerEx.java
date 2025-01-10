package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemSortedIntegerEx {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();

		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		
		List<Integer>  sortedList1 = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList1);

		System.out.println("--------------------------------");
		List<Integer> sortedList2 = marks.stream().sorted((I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(sortedList2);

		System.out.println("--------------------------------");
		List<Integer> sortedList3 = marks.stream().sorted((I1, I2) -> I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println(sortedList3);

		System.out.println("--------------------------------");
		List<Integer> sortedList4 = marks.stream().sorted((I1, I2) -> I2.compareTo(I1)).collect(Collectors.toList());
		System.out.println(sortedList4);

		System.out.println("--------------------------------");
		List<Integer> sortedList5 = marks.stream().sorted((I1, I2) -> -I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println(sortedList5);
	}
}
