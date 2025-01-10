package org.myapp.string.program;

public class StringSplitMethodDemo {
	
	public static void main(String[] args) {
		
		String message = "ram syam ghanshyam manoj";
		String[] s = message.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
