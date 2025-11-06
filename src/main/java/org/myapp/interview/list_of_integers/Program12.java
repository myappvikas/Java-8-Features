package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.stream.IntStream;

public class Program12 {

    private static final Logger log = LoggerFactory.getLogger(Program12.class);

    public static void main(String[] args) {

            var listOfEvenNumbers = IntStream
                    .range(1, 100)
                    .filter(i -> i % 2 == 0)
                    .mapToLong(e -> e)
                    .boxed()
                    .toList();
            log.info("Even numbers list: {}", listOfEvenNumbers);
    }
}
