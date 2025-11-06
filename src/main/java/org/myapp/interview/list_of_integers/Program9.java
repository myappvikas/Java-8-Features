package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

public class Program9 {

    private static final Logger log = LoggerFactory.getLogger(Program9.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 22, 33, 4, 55, 6, 7, 8, 9);
        Optional<Integer> optional = list
                .stream().sorted(Comparator.reverseOrder())
                .distinct()
                .limit(2)
                .skip(1)
                .findFirst();
        log.info("Second highest number (Program 1): {}", optional.orElse(null));

        //Program 2
        Optional<Integer> optional1 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        optional1.ifPresent(value -> log.info("Second highest number (Program 2): {}", value));
    }
}
