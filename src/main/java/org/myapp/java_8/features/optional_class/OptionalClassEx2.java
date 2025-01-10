package org.myapp.java_8.features.optional_class;

import java.util.Optional;

public class OptionalClassEx2 {
	
	public static void main(String[] args) {
		
		String[] strArr = new String[10];
		Optional<String> optional = Optional.ofNullable(strArr[5]);
		
		System.out.println(optional);
		
		if (optional.isPresent()) {
			String lowercaseString = strArr[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("String value is not present");	}
}
