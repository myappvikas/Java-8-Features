package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.stream.IntStream;

public class Program20 {

    private static final Logger log = LoggerFactory.getLogger(Program20.class);

    public static void main(String[] args) {

        String str = "abaabccdabc";
        String word = "abc";
        List<Integer> indices = IntStream.range(0, str.length() - word.length() + 1)
                .filter(i -> str.startsWith(word, i))
                .boxed()
                .toList();
        long count = indices.size();
        log.info("Occurrences of string: {} {} {} {} {}", word,"count ", count,"and index-",indices);
    }
}
