package org.myapp.exception.handaling.exception;

public class ExceptionTryCatchDemo2 {
	
	public static void main(String[] args) {
		
		try {
			int data = 50/0;
			System.out.println("Rest of code here");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
