package org.myapp.java_8.features;

public interface Interface1 {

	public void m1();

	public void m2();

	public void m3();

	public void m4();

	public void m100();

	default void m101() {
		System.out.println("Default Method of interface1");
	}
}

class Test implements Interface1 {

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
	}

	@Override
	public void m3() {
	}

	@Override
	public void m4() {
	}

	@Override
	public void m100() {
	}
}
