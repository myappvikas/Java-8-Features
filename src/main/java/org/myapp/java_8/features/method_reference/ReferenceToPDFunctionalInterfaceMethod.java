package org.myapp.java_8.features.method_reference;

public class ReferenceToPDFunctionalInterfaceMethod {
	
	public static void main(String[] args) {
		
		Runnable r = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread "+i);
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 100; i < 110; i++) {
			System.out.println("main thread "+i);
		}
	}

}
