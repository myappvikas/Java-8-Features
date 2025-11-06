package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Program6 {

    private static final Logger log = LoggerFactory.getLogger(Program6.class);
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 7, 3, 2, 9, 8);
        Optional<Integer> optional1 = list.stream().max(Comparator.comparing(Integer::valueOf));
        optional1.ifPresent(value -> log.info("Value present: {}", value));

        Optional<Integer> optional2 = list.stream().min(Comparator.comparing(Integer::valueOf));
        optional2.ifPresent(value -> log.info("Value present: {}", value));
    }
}
