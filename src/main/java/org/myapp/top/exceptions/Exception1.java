package org.myapp.top.exceptions;

public class Exception1 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		//System.out.println(arr[0]);
		//System.out.println(arr[9]);
		//System.out.println(arr[100]);
		System.out.println(arr[-100]);
	}
}
