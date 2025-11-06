package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program13 {

    private static final Logger log = LoggerFactory.getLogger(Program13.class);

    public static void main(String[] args) {

        var listOfInteger = Arrays.asList(1, 2, 3, 4, 5);
        var listOfInteger2 = Arrays.asList(6, 7, 8, 9);
        var concatenatedList = Stream.concat(listOfInteger.stream(), listOfInteger2.stream()).toList();
        log.info("concatenated list: {}", concatenatedList);
    }
}
