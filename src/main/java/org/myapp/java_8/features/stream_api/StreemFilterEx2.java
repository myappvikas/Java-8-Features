package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemFilterEx2 {

	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<>();

		listOfString.add("vikss");
		listOfString.add("deepsk");
		listOfString.add("ambrish");
		listOfString.add("vikas");
		listOfString.add("sahanwaz");

		System.out.println(listOfString);

		List<String> list = listOfString.stream().filter(s -> s.length() == 5).collect(Collectors.toList());

		Long count = listOfString.stream().filter(s -> s.length() == 5).count();

		System.out.println(list);

		System.out.println("count is: " + count);
	}

}
