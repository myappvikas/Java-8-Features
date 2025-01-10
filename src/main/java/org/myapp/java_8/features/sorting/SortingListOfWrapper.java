package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.List;

public class SortingListOfWrapper {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(60,30,20,70,3,100);

		intList.add(10);
		intList.add(20);
		intList.add(5);
		intList.add(15);
		intList.add(25);
		intList.add(30);

		//Method 1.
		intList.sort((I1, I2)->I1.compareTo(I2));
		System.out.println(intList);

		//Method 2.
		//Collections.sort(intList);
		//System.out.println(intList);

		//Method 3.
		//Collections.sort(intList, (I1, I2) -> I1.compareTo(I2));
		//Collections.sort(intList, (I1, I2) -> I2.compareTo(I1));
		//Collections.sort(intList, (I1, I2) -> -I1.compareTo(I2));
		//System.out.println(intList);

	}
}
