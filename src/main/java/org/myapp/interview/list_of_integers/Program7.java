package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program7 {

    private static final Logger log = LoggerFactory.getLogger(Program7.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 30, 20, 7, 50, 40, 40, -40, 700, 400);
        List<Integer> sortedList = list.stream()
                .sorted()
                .toList();
        log.info("Sorted List: {}", sortedList);

        //Program 2
        List<Integer> sortedList2 = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        log.info("Sorted list in reverse order: {}", sortedList2);

        //Program 3
        List<Integer> sortedList3 = list
                .stream()
                .sorted(Collections.reverseOrder())
                .toList();
        log.info("Sorted list in reverse order: {}", sortedList3);
    }
}
