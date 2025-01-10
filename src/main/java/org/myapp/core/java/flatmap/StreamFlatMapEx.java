package org.myapp.core.java.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapEx {

	public static void main(String[] args) {
		
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(Arrays.asList(1,2));
		lists.add(Arrays.asList(3,4));
		lists.add(Arrays.asList(5,6));
		lists.add(Arrays.asList(7,8));
		lists.add(Arrays.asList(9,10));
		
		List<Integer> intList = lists.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println("Result List: "+intList);
	}
}
