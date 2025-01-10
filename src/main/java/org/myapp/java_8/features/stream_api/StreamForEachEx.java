package org.myapp.java_8.features.stream_api;

import java.util.List;

public class StreamForEachEx {

	public static void main(String[] args) {

		List<String> strList = List.of("AAA","AAAAA","AAAA","A","AA");

		strList.forEach(n -> System.out.println(n));
		
		strList.stream().forEach(n -> System.out.println(n));
		
		strList.stream().forEachOrdered(n -> System.out.println(n));
		
	}
}
