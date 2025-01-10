package org.myapp.java_8.features.method_reference;

public class ReferenceToInstanceMethodEx {

	public void m1() {
		for (int i = 100; i < 106; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Runnable r = new ReferenceToInstanceMethodEx()::m1;
		Thread t = new Thread(r);
		t.start();
	}

}
