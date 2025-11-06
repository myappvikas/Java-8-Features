package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Program5 {

    private static final Logger log = LoggerFactory.getLogger(Program5.class);

    public static void main(String[] args) {

        log.info("Return a map containing the duplicate numbers as keys and a list" +
                        " of those duplicate numbers as values");
        List<Integer> list = Arrays.asList(5, 2, 2, 2, 3, 5, 3, 6, 11, 6, 11, 13);
        Map<Integer, List<Integer>> map = list.stream()
                .filter(e -> Collections.frequency(list, e) > 0)
                .collect(Collectors.groupingBy(e -> e, Collectors.toList()));
        map.forEach((k, v) -> log.info("{}: {}", k, v));

        log.info("Counting no. of times duplicate number is there");
        Map<Integer, Long> map2 = list.stream()
                .filter(e -> Collections.frequency(list, e) > 0)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        map2.forEach((k, v) -> log.info("{}: {}", k, v));
    }
}
