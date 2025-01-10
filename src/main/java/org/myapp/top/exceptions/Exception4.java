package org.myapp.top.exceptions;

public class Exception4 {
	
	public static void main(String[] args) {
		
		String s = new String("vikas");
		//Object obj = (Object)s;
		//System.out.println(obj);
		
		Object obj1 = new Object();
		String s1 = (String)obj1;
		System.out.println(s1);
		
		Object obj2 = new String("vikas");
		//String s2 = (String)obj2;
		//System.out.println(s2);
	}
}
