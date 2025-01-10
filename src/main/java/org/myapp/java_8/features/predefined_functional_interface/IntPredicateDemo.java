package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateDemo {
	
	public static void main(String[] args) {
		// In this case autoboxing and autounboxing happen.
		//int - Integer - int
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(13));
		
		//Primitive version of predicate.
		//No conversion is there so performance issue is not there.
		IntPredicate p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
		
	}

}
