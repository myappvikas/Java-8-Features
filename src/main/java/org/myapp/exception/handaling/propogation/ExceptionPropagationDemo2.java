package org.myapp.exception.handaling.propogation;

import java.io.IOException;

public class ExceptionPropagationDemo2 {
	
	void m() {
		//Compilation error
		//throw new IOException();
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
		
		ExceptionPropagationDemo2 test = new ExceptionPropagationDemo2();
		test.p();
		System.out.println("Rest of code");
	}
}
