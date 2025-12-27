package org.myapp.string.joining;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(", ");
		joiner.add("Java").add("Programming").add("Language");
		System.out.println(joiner);

		StringJoiner joiner1 = new StringJoiner(", ", "[", "]");
		joiner1.add("C").add("C++").add("Java");
		System.out.println(joiner1);
		
		StringJoiner joiner2 = new StringJoiner(", ", "[", "}");
		joiner2.add("C").add("C++").add("Java");
		System.out.println(joiner2);
		
		StringJoiner joiner3 = joiner1.merge(joiner2);
		System.out.println(joiner3);
		
		StringJoiner joiner4 = new StringJoiner("");
		joiner4.add("POCO").add("Samsung").add("RedMi");
		System.out.println(joiner4);
		
		StringJoiner joiner5 = new StringJoiner(", ", "[", "]");
		joiner5.add(" AAA").add("BBB").add("CCC");
		System.out.println(joiner5);
		
		StringJoiner joiner6 = joiner4.merge(joiner5);
		System.out.println(joiner6);
		
		List<String> strList = Arrays.asList("Vikas","Kumar","Gupta");
		strList.stream().collect(Collectors.joining(", ", "{", "}"));
		System.out.println(strList);
	}
}
