package org.myapp.collection.framework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
		System.out.println(list);
		
		itr.remove();
		System.out.println("------After removing last element-----------");
		System.out.println(list);
		
		itr.forEachRemaining(System.out::println);
		
		
	}
}
