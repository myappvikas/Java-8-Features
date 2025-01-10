package org.myapp.collection.framework.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
public static void main(String[] args) {
		
		Set<String> tst = new TreeSet<>();
		tst.add("");
		tst.add("One");
		tst.add("One");
		tst.add("Two");
		tst.add("Three");
		tst.add("Four");
		tst.add("Five");
		System.out.println(tst);
		tst.forEach(System.out::println);
	}
}
