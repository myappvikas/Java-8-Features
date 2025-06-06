package org.myapp.core.java.iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*In Java, Fail-Fast and Fail-Safe iterators refer to how an iterator
behaves when the underlying collection is modified during iteration.*/

/*
A Fail-Fast iterator throws a ConcurrentModificationException if
the collection is structurally modified after the creation of
the iterator (except through the iterator’s own remove() method).
*/

public class FailFastAndFailSafeIterator2 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();

		strList.add("AA");
		strList.add("BB");
		strList.add("CC");
		strList.add("DD");
		strList.add("EE");
		
		Iterator<String> itr = strList.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()); // Structural change is not possible
			strList.add("VK");
		}

		System.out.println("-------------------------------");

		Map<Integer, String> map = new Hashtable<>();

		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		
		Iterator<Entry<Integer, String>> itr1 = entry.iterator();
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			map.put(6, "XXX");
		}

	}
}
