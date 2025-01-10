package org.myapp.java_8.features.lambda_expression;

interface Sayable4 {
	public String say(String name);
}

public class LambdaExpressionExample4 {
	
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable4 s4 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s4.say("vikas"));

		// You can omit function parentheses
		Sayable4 s42 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s42.say("deepak"));
	}
}