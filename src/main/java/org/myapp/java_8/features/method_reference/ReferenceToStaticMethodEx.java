package org.myapp.java_8.features.method_reference;

public class ReferenceToStaticMethodEx {

	public static void m1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Runnable r = ReferenceToStaticMethodEx::m1;
		Thread t = new Thread(r);
		t.start();
	}
}
