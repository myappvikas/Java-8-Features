package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class Program19 {

    private static final Logger log = LoggerFactory.getLogger(Program19.class);

    public static void main(String[] args) {

        String str = "abaabccdabc";
        String word = "abc";
        long count = IntStream.range(0, str.length() - word.length() + 1)
                .filter(i -> str.startsWith(word, i))
                .count();
        log.info("Occurrences of string: {} {} {}", word,": ", count);
    }
}
