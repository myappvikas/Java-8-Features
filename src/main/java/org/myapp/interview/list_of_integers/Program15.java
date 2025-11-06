package org.myapp.interview.list_of_integers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;


public class Program15 {

    private static final Logger log = LoggerFactory.getLogger(Program15.class);
    public static void main(String[] args) {

        var listOfString = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        var listOfString2 = Arrays.asList("banana", "cherry", "fig", "grape", "apple");

        var commonElements = listOfString.stream()
                .filter(listOfString2::contains)
                .toList();
        log.info("Common Elements: {}", commonElements);
    }
}

