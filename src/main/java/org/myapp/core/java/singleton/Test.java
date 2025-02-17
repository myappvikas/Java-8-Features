package org.myapp.core.java.singleton;

public class Test {
	
	private static final Test test = new Test();
	
	private Test() {
	}
	
	public synchronized static Test getTest() {
		return test;
	}
}
