package org.myapp.java_8.features.lambda_expression;

interface Addable6 {
	int add(int a, int b);
}

public class LambdaExpressionExample6 {
	
	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Addable6 ad61 = (a, b) -> (a + b);
		System.out.println(ad61.add(100, 200));

		// Lambda expression with return keyword.
		Addable6 ad62 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad62.add(1000, 2000));
	}
}