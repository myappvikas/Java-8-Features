package org.myapp.core.java.duplicacy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddingCustomClassExammple {

	public static void main(String[] args) {

		List<Book> list = Arrays.asList(
				new Book("bookname1", 10), 
				new Book("bookname2", 13), 
				new Book("bookname3", 11),
				new Book("bookname4", 9), 
				new Book("bookname2", 13), 
				new Book("bookname3", 11));

		System.out.println("After avoiding duplicate elements - -");
		Set<Book> books = new HashSet<Book>(list);
		System.out.println(books.size());
		for (Book b : books) {
			System.out.println("Book name is: - " + b.bookName + "   " + "Book id is :- " + b.bookId);
		}
	}
}