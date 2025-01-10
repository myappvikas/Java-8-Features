package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.BiPredicate;

//BiPredicate takes two input arguments and every thing is same. 
public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));
	}
}
