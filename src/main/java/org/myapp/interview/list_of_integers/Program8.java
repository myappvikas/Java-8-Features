package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;


public class Program8 {

    private static final Logger log = LoggerFactory.getLogger(Program8.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list1 = list.stream().limit(4).toList();
        log.info("First 4 elements: {}", list1);

        List<Integer> list2 = list.stream().skip(4).toList();
        log.info("Elements after skipping first 4: {}", list2);

        List<Integer> list3 = list.stream().distinct().toList();
        log.info("Distinct elements: {}", list3);

        long count = list.stream().distinct().count();
        log.info("Count of distinct elements: {}", count);
    }
}
