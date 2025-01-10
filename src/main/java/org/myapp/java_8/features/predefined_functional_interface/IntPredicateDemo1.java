package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateDemo1 {
	
	public static void main(String[] args) {
		
		int[] intArray = {0,5,10,15,20,25,30};
		
		Predicate<Integer> p = i -> i % 2 == 0;
		
		for (int intValue : intArray) {
			if(p.test(intValue))
			System.out.print(intValue+" ");
		}
		
		System.out.println("\n");
		
		int[] intArray1 = {0,5,10,15,20,25,30};
		
		IntPredicate p1 = i -> i % 2 == 0;
		
		for (int intValue : intArray1) {
			if(p1.test(intValue))
			System.out.print(intValue+" ");
		}
	}

}
