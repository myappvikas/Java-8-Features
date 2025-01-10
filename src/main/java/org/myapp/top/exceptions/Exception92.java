package org.myapp.top.exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class Exception92 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			itr.remove();
		}
	}
}
