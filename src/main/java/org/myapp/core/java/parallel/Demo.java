package org.myapp.core.java.parallel;

import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(1,100);
		end = System.currentTimeMillis();
		System.out.println("Total Time: "+(end-start));

        start = System.currentTimeMillis();
        IntStream.range(1,100);
        end = System.currentTimeMillis();
        System.out.println("Total Time: "+(end-start));

    }
}
