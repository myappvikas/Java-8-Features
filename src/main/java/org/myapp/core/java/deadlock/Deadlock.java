package org.myapp.core.java.deadlock;

public class Deadlock extends Thread{

	A a = new A();
	B b = new B();
	
	public void m1(){       //Executed by main thread
		this.start();
		a.d1(b);
	}
	@Override
	public void run() {     //Executed by child thread
		b.d2(a);
	}
	public static void main(String[] args) {
		Deadlock deadlock = new  Deadlock();
		deadlock.m1();
	}

}
