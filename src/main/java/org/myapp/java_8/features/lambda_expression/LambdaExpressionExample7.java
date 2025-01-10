package org.myapp.java_8.features.lambda_expression;

import java.util.*;

public class LambdaExpressionExample7 {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("vikas");
		list.add("deepak");
		list.add("ambrish");
		list.add("sunil");

		list.forEach((n) -> System.out.println(n));
		System.out.println("------------------------");
		//we can use method reference also.
		list.forEach(System.out::println);
	}
}