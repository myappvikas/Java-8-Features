package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program14 {

    private static final Logger log = LoggerFactory.getLogger(Program14.class);

    public static void main(String[] args) {

        var str = "swiss";
        var listOfDistinctChar =  str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .toList();
        log.info("List of distinct chars: {}", listOfDistinctChar);
        var optional = str
                .chars()
                .mapToObj(e -> (char) e)
                .distinct()
                .findFirst();
        optional.ifPresent(c -> log.info("First character: {}", optional.get()));
    }
}
