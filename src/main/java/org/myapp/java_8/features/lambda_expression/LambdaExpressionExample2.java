package org.myapp.java_8.features.lambda_expression;

@FunctionalInterface // It is optional
interface Drawable2 {
	public void draw();
}

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		int width = 10;

		// with lambda Expression

		Drawable2 d2 = () -> {
			System.out.println("Drawing 2: " + width);
		};
		d2.draw();

	}
}