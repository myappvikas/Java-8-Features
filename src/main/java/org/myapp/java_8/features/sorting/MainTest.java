package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MainTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,5,1,2,7,9,8);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
