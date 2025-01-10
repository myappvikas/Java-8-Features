package org.myapp.string.program;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("My name is vikas kumar gupta");
		while (s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}
	}
}
