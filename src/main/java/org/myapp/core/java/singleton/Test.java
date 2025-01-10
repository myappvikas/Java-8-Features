package org.myapp.core.java.singleton;

public class Test {
	
	private static Test test = new Test();
	
	private Test() {
	}
	
	public static Test getTest() {
		return test;
	}
}
