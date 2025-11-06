package org.myapp.java_8.features.default_and_static_method;

interface Interface4 {
	default void n() {
		System.out.println("Default method n");
	}
}

public class Test1 implements Interface4 {

	public void n() {
		System.out.println("Default overridden method n");
	}

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.n();
	}

}
