package org.myapp.exception.handaling.propogation;

public class ExceptionPropagationDemo1 {
	
	void m() {
		int data = 30/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
		   System.out.println("Exception occur");
		}
	}
	public static void main(String[] args) {
		
		ExceptionPropagationDemo1 test = new ExceptionPropagationDemo1();
		test.p();
		System.out.println("Rest of code");
	}
}
