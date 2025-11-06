package org.myapp.string.api;

import java.util.StringTokenizer;

public class StringTokenizer1Demo {
	
	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("My,name,is,vikas");
		System.out.println(s.nextToken());
	}
}
