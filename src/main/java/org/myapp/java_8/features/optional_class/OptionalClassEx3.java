package org.myapp.java_8.features.optional_class;

import java.util.Optional;

public class OptionalClassEx3 {

	public static void main(String[] args) {

		String[] str = new String[10];
		
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		System.out.println(checkNull.get());

		if (checkNull.isPresent()) {
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("String value is not present");
	}
}
