package org.myapp.core.java.ambiguity;

/*Ambiguity in Java typically refers to situations where the compiler cannot
determine which method or constructor to call,
usually due to method overloading or diamond inheritance (in interfaces).*/

public class AmbiguityDemo {

	public static void sum(int a, long b) {
		System.out.println("Sum of int and long value :" + (a + b));
	}

	public static void sum(long a, int b) {
		System.out.println("Sum of long and int value :" + (a + b));
	}
	
	public static void main(String[] args) {
		//Problem
		//AmbiguityDemo.sum(10, 20);
		
		//Solution.
		AmbiguityDemo.sum(10, 20l);
	}
}
