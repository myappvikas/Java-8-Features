package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MainTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("AA","AAAA","AAA","AAAAA","A");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
