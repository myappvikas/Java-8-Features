package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemSortedStringEx {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();

		strList.add("vikas gupta");
		strList.add("deepak kumar gupta");
		strList.add("hariom yadav");
		strList.add("uma");
		strList.add("shahanwaj");

		List<String> nameList = strList.stream().sorted().collect(Collectors.toList());
		System.out.println(nameList);

		System.out.println("----------------------------");
		List<String> nameList1 = strList.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(nameList1);

		System.out.println("----------------------------");
		List<String> nameList2 = strList.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(nameList2);

		System.out.println("----------------------------");
		List<String> nameList3 = strList.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(nameList3);

		System.out.println("Increasing Length Order of String");
		List<String> nameList4 = strList.stream().sorted((s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);
		}).collect(Collectors.toList());
		System.out.println(nameList4);
	}
}
