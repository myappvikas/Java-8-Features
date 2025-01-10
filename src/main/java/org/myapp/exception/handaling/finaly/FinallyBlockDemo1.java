package org.myapp.exception.handaling.finaly;

public class FinallyBlockDemo1 {
	
	public static void main(String[] args) {
		
		try {
			int data = 50/5;
			System.out.println(data);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block always executed");			
		}
		System.out.println("rest of code from finally block");
	}
}
