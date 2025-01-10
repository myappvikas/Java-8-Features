package org.myapp.exception.handaling.finaly;

public class FinallyBlockDemo3 {
	
	public static void main(String[] args) {
		
		try {
			int data = 30/0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Exception raised");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
