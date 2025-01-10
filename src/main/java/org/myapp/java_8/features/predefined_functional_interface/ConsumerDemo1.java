package org.myapp.java_8.features.predefined_functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println(m.name + ": Ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name + ": Released but this is bigger flop");
		Consumer<Movie> c3 = m -> System.out.println(m.name + ": Storing movie info to dataase");

		Movie movie = new Movie("Spider Man");
		c1.accept(movie);
		c2.accept(movie);
		c3.accept(movie);

		System.out.println("------------------------------");

		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		cc.accept(movie);

	}
}
