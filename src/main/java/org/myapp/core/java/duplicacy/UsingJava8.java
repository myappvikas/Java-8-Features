package org.myapp.core.java.duplicacy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class UsingJava8 {

	public static void main(String[] args) {

		List<Book> list = Arrays.asList(
				new Book("bookname1", 10), 
				new Book("bookname2", 13), 
				new Book("bookname3", 11),
				new Book("bookname4", 9), 
				new Book("bookname2", 13), 
				new Book("bookname3", 11));

		System.out.println("After avoiding duplicate elements - -");
		list.stream().distinct().forEach(System.out::println);
	}
}
