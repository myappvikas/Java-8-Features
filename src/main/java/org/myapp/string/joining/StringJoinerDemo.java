package org.myapp.string.joining;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(", ");
		joiner.add("Java").add("Programming").add("Language");
		System.out.println(joiner.toString());

		StringJoiner joiner_1 = new StringJoiner(", ", "[", "]");
		joiner_1.add("C").add("C++").add("Java");
		System.out.println(joiner_1.toString());
		
		StringJoiner joiner_2 = new StringJoiner(", ", "[", "}");
		joiner_2.add("C").add("C++").add("Java");
		System.out.println(joiner_2.toString());
		
		StringJoiner joiner_3 = joiner_1.merge(joiner_2);
		System.out.println(joiner_3.toString());
		
		StringJoiner joiner_4 = new StringJoiner("");
		joiner_4.add("POCO").add("Samsung").add("RedMi");
		
		StringJoiner joiner_5 = new StringJoiner(", ", "[", "]");
		joiner_5.add(" AAA").add("BBB").add("CCC");
		System.out.println(joiner_2.toString());
		
		StringJoiner joiner_6 = joiner_4.merge(joiner_5);
		System.out.println(joiner_6.toString());
		
		List<String> strList = Arrays.asList("Vikas","Kumar","Gupta");
		strList.stream().collect(Collectors.joining(", ", "{", "}"));
		System.out.println(strList);
	}
}
