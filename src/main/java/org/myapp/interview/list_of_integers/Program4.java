package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Program4 {

    private static final Logger log = LoggerFactory.getLogger(Program4.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(555, 55555, 123, 234, 453, 55);
        List<Integer> resultList = list
                .stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("5"))
                .map(Integer::valueOf)
                .toList();
        log.info("Filtered List: {}", resultList);
    }
}
