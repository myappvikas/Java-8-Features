package org.myapp.exception.handaling.exception;

public class ExceptionTryCatchDemo3 {
	
	public static void main(String[] args) {
		
		try {
			int data = 50/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of code here");
	}
}
