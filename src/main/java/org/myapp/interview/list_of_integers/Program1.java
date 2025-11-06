package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program1 {

    private static final Logger log = LoggerFactory.getLogger(Program1.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> optional = list.stream().reduce((a, b) -> a + b);
        optional.ifPresent(integer -> log.info(integer.toString()));
    }
}
