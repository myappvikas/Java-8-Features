package org.myapp.java_8.features.predefined_functional_interface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
