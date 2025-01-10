package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {

			String otp = "";

			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(supplier.get());
		
	}
}
