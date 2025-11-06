package org.myapp.exception.handaling.exception;

public class ExceptionTryCatchDemo1 {
	
	public static void main(String[] args) {
		
		try {
			int data = 50/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of code here");
	}
}
