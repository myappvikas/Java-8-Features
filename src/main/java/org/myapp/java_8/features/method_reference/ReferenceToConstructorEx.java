package org.myapp.java_8.features.method_reference;

public class ReferenceToConstructorEx {

	public static void main(String[] args) {

		Interff i = Sample::new;
		Sample sample = i.get();
		System.out.println(sample);
	}
}

class Sample {

	public Sample() {
		System.out.println("Sample class constructor");
	}
}

interface Interff {
	public Sample get();
}
