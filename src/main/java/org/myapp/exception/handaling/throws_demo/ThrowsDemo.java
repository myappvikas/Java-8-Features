package org.myapp.exception.handaling.throws_demo;

import java.io.IOException;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		
		M obj = new M();
		try {
			obj.method();
		} catch (IOException e) {
			System.out.println("Exception Handaled");
		}
		System.out.println("Rest of the code");
	}
}
class M{
	public void method()throws IOException{
		throw new IOException();
	}
}