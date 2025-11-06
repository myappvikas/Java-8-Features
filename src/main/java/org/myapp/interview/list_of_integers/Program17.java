package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Program17 {

    private static final Logger log = LoggerFactory.getLogger(Program17.class);

    public static void main(String[] args) {

        var numbers = new int[]{5, 2, 9, 1, 7};
        var sortedArray = Arrays.stream(numbers).sorted().toArray();
        log.info("Sorted array: {}", sortedArray);
    }
}
