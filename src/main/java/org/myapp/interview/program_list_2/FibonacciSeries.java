package org.myapp.interview.program_list_2;

import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(e -> e[0])
                .forEach(e -> System.out.print(e + " "));
    }
}
