package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		Integer[] intArr = { 0, 5, 10, 15, 20, 25, 30, 35 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i1 -> i1 > 15;

		System.out.println("The numbers which are even and greator than 15");
		for (Integer number : intArr) {
			if (p1.and(p2).test(number)) {
				System.out.print(number + " ");
			}
		}

		System.out.println();
		System.out.println("The numbers which are even or greator than 15");
		for (Integer number : intArr) {
			if (p1.or(p2).test(number)) {
				System.out.print(number + " ");
			}
		}

		System.out.println();
		System.out.println("The numbers which are not even");
		for (Integer number : intArr) {
			if (p1.negate().test(number)) {
				System.out.print(number + " ");
			}
		}

		System.out.println();
		System.out.println("The numbers which are not even");
		for (Integer number : intArr) {
			if (Predicate.not(p2).test(number)) {
				System.out.print(number + " ");
			}
		}

	}
}
