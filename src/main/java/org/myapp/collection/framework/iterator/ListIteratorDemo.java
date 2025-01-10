package org.myapp.collection.framework.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		ListIterator<String> itr = list.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
