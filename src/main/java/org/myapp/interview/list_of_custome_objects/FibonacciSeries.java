package org.myapp.interview.list_of_custome_objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.stream.Stream;

public class FibonacciSeries {

    private static final Logger log = LoggerFactory.getLogger(FibonacciSeries.class);

    public static void main(String[] args) {

        int[] ints = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .mapToInt(e ->e[0])
                .toArray();
        log.info("Fibonacci series: {}", ints);
    }
}
