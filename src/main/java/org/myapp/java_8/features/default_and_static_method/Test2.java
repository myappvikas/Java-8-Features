package org.myapp.java_8.features.default_and_static_method;

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

class Test10 implements Interface5, Interface6{
	public void a(){
		Interface6.super.a();
	}

}
public class Test2 {

	public static void main(String[] args) {

		Test10 test10 = new Test10();
		test10.a();
	}
}
