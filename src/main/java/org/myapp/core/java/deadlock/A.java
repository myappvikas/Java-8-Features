package org.myapp.core.java.deadlock;

public class A {
	public synchronized void d1(B b) {
		System.out.println("Thread 1 start execution of d1() method.");
		try {
		Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("Thread 1 trying to call b's last() method.");
		}
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A, last() method");
	}

}
