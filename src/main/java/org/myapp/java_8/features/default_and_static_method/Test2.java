package org.myapp.java_8.features;

interface Interface5{
	default void a() {
		System.out.println("Default method a from Interface5");
	}
}
interface Interface6{
	default void a() {
		System.out.println("Default method a from Interface6");
	}
}
public class Test2 implements Interface5,Interface6{
	
	public void a() {
		Interface5.super.a();
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.a();
	}
}
