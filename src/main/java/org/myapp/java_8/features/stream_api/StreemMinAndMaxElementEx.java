package org.myapp.java_8.features.stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreemMinAndMaxElementEx {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(5);
		intList.add(15);
		intList.add(20);
		intList.add(25);
		intList.add(10);
		
		System.out.println("List is :"+intList);
		System.out.println("According to natural sorting order");
		int minElement =  intList.stream().min((e1,e2)-> e1.compareTo(e2)).get();
		System.out.println("Min Element :"+minElement);
		int maxElement =  intList.stream().max((e1,e2)-> e1.compareTo(e2)).get();
		System.out.println("Max Element :"+maxElement);
		
		System.out.println("According to reverse of natural sorting order");
		int minElement1 =  intList.stream().min((e1,e2)-> -e1.compareTo(e2)).get();
		System.out.println("Min Element :"+minElement1);
		int maxElement2 =  intList.stream().max((e1,e2)-> -e1.compareTo(e2)).get();
		System.out.println("Max Element :"+maxElement2);

	}

}
