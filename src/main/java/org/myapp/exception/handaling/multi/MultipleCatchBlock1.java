package org.myapp.exception.handaling.multi;

public class MultipleCatchBlock1 {
	
	public static void main(String[] args) {
		
		try {
			int[] intArray = new int[10];
			intArray[5] = 30/0;
		} catch (ArithmeticException e) {
			System.out.println("exception raised");
			e.getMessage();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("Rest of code here");
	}
}
