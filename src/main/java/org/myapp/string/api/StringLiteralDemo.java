package org.myapp.string.api;

public class StringLiteralDemo {
	
	public static void main(String[] args){
		
		String str = "java";
		char[] ch = {'S','t','r','i','n','g','s'};
		String str2 = new String(ch);
		String str3 = new String("Example");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		//Checking the hash code value of all String
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}

}
