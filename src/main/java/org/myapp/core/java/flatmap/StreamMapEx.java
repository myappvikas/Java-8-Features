package org.myapp.core.java.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapEx {
	
	public static void main(String[] args) {
		
		List<String> strList = Stream.of("a","b","c").map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(strList);
	}

}
