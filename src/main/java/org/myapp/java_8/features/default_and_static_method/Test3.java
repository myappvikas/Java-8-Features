package org.myapp.java_8.features;

interface Interface7{
	
	public static void m6() {
		System.out.println("MyInterface Static method method");
	}
}

public class Test3 implements Interface7{
    public static void main(String[] args) {
    	Interface7.m6();
		
		//Test3 test = new Test3();
		//test.m6();
		//Test3.m6();
		//m6();
	}
}
