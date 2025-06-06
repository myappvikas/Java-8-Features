package org.myapp.core.java.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*
A Fail-Safe iterator does not throw an exception if the
collection is modified during iteration. Instead,
it works on a copy of the original collection or uses special mechanisms to avoid exceptions.
*/

public class FailFastAndFailSafeIterator {

	public static void main(String[] args) {
		
		List<String> strList = new CopyOnWriteArrayList<>();
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
		Map<Integer, String> map = new ConcurrentHashMap<>();
		
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
