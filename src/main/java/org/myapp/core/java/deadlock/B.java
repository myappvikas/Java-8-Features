package org.myapp.core.java.deadlock;

public class B {
	public synchronized void d2(A a) {
		System.out.println("Thread 2 start execution of d2() method.");
		try {
		Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("Thread 2 trying to call A's last() method.");
		}
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B, last() method");
	}

}
