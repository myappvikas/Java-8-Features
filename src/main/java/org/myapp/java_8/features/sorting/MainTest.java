package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MainTest {

	public static void main(String[] args) {

		var list = List.of(
			new Customer("ambrish","dullahapur"),
				new Customer("deepak","dullahapur"),
				new Customer("vikas","dullahapur")
		);
		list.stream().sorted(Comparator.comparing(Customer::name).reversed())
				.forEach(System.out::println);
	}
}
record Customer(String name, String address){}