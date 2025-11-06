package org.myapp.exception.handaling.nested;

public class NestedCatchBlockDemo {
	
	public static void main(String[] args) {
		
		try {
			try {
			System.out.println("going to divide");
			int data = 30/2;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				int[] intArr = new int[5];
				intArr[5] = 4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
