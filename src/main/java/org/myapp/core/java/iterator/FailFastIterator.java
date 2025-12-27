package org.myapp.core.java.iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
A Fail-Fast iterator throws a ConcurrentModificationException if
the collection is structurally modified after the creation of
the iterator (except through the iterator’s own remove() method).
*/

public class FailFastIterator {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("AA");
		strList.add("BB");
		strList.add("CC");
		strList.add("DD");
		strList.add("EE");
        for (String s : strList) {
            System.out.println(s); // Structural change is not possible
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
        for (Entry<Integer, String> integerStringEntry : entry) {
            System.out.println(integerStringEntry);
            map.put(6, "XXX");
        }
	}
}
