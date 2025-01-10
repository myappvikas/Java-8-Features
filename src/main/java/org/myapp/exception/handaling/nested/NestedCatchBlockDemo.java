package org.myapp.exception.handaling.nested;

public class NestedCatchBlockDemo {
	
	public static void main(String[] args) {
		
		try {
			try {
			System.out.println("going to divide");
			int data = 30/2;
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			try {
				int[] intArr = new int[5];
				intArr[5] = 4;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
