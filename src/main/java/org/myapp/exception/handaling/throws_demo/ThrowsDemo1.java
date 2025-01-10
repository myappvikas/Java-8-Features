package org.myapp.exception.handaling.throws_demo;

import java.io.IOException;

public class ThrowsDemo1 {

	public static void main(String[] args) throws IOException{
		
		M1 obj1 = new M1();
		obj1.method();
		System.out.println("Rest of code");
	}
}
class M1{
	public void method() throws IOException {
		System.out.println("Device exception performed");
	}
}
