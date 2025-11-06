package org.myapp.core.java.parallel;

import java.util.stream.IntStream;

public class ParallelStreamDemo_2 {
    public static void main(String[] args) {
        // Sequential stream
        System.out.println("Sequential Stream:");
        IntStream.range(1, 10)
                .forEach(System.out::println);

        // Parallel stream
        System.out.println("\nParallel Stream:");
        IntStream.range(1, 10)
                .parallel()
                .forEach(System.out::println);
    }
}
