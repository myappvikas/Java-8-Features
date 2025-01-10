package org.myapp.java_8.features.lambda_expression;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample1 {
	
	public static void main(String[] args) {
		int width = 10;
		
		// without lambda Expression
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
	}
}