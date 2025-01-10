package org.myapp.exception.handaling.throws_demo;

import java.io.IOException;

public class ThrowsDemo2 {

	public static void main(String[] args) throws IOException {

		M2 obj2 = new M2();
		obj2.method();

		System.out.println("Normal Flow");
	}
}

class M2 {
	public void method() throws IOException {
		throw new IOException();
	}
}
