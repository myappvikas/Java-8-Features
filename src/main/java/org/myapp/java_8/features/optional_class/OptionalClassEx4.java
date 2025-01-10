package org.myapp.java_8.features.optional_class;

import java.util.Optional;

public class OptionalClassEx4 {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		System.out.println(checkNull);
		
		checkNull.ifPresent(System.out::println);
		
		System.out.println(checkNull.get()); // printing value by using get method
		System.out.println(str[5].toLowerCase());
	}

}
