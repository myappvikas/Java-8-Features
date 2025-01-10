package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println("---------andThen-----------------");
		System.out.println(f1.andThen(f2).apply(2));
		// output = 2*2=4 and then 4*4*4=64
		
		System.out.println("-----------compose---------------");
		System.out.println(f1.compose(f2).apply(2));
		// output = 2*2*2=8 and then 2*8=16
		
		System.out.println("-------------identity--------------");
		System.out.println(Function.identity());
	}
}
