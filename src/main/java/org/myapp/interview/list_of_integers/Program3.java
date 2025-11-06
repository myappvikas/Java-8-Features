package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Program3 {

    private static final Logger log = LoggerFactory.getLogger(Program3.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = list.stream()
                .filter(i -> i % 2 == 0)
                .toList();
        log.info("All even numbers: {}", evenNumbers);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumbers = list2.stream()
                .filter(i -> i % 2 == 1).toList();
        log.info("All odd numbers: {}", oddNumbers);
    }
}
