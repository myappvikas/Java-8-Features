package org.myapp.string.api;

public class StringImmutableDemo {
	
	public static void main(String[] args) {
		
		String s = "Sachin";
		s = s.concat(" Tendulker");
		System.out.println(s);
		
		String s1 = "Sachin";
		s1.concat(" Tendulker");
		System.out.println(s1);
	}

}
