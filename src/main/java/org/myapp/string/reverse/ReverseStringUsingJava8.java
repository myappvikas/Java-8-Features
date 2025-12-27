package org.myapp.string.reverse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {

    private static final Logger log = LoggerFactory.getLogger(ReverseStringUsingJava8.class);

    public static void main(String[] args) {

        String str = "vikas";

        // Reverse the string using Java 8 Streams
        String reversed = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        log.info("Original String: {}", str);
        log.info("Reversed String: {}", reversed);

        log.info("");

        //Program 2.
        String s = "java programming language";
        String[] strings = s.split(" ");
        String reverse = IntStream.range(0,strings.length)
                .mapToObj(i->strings[strings.length-i-1])
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        log.info("Original String: {} ", s);
        log.info("Reversed String: {} ", reverse);
    }
}
