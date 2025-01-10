package org.myapp.top.exceptions;

public class ClassNotFoundException {
	
	public static void main(String[] args) throws Exception{

		Class.forName(args[0]).newInstance();
	}
}
