package org.myapp.java_8.features;

public interface Interface3 {

	default void p() {
		System.out.println("Default method p inside interface3");
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	//default int hashCode();

	public int hashCode();

	public String toString();

	public int add(int a, int b);

}
