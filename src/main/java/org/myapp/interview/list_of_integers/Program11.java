package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program11 {

    private static final Logger log = LoggerFactory.getLogger(Program11.class);

    public static void main(String[] args) {

        Stream.of("vikas","manoj","uma","ram")
                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
                .forEach((k,v)-> log.info("Grouping by length: {}, {}",k,v));
    }
}
