package org.myapp.java_8.features;

interface Interface4 {
	default void n() {
		System.out.println("Default method n");
	}
}

public class Test1 implements Interface4 {

	public void n() {
		System.out.println("Default overriden method n");
	}

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.n();
	}

}
