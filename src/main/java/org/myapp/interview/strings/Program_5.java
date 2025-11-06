package org.myapp.interview.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Program_5 {

    public static void main(String[] args) {

        String input = "vikas kumar gupta kumar gupta uma mahesh";
        String[] words = input.split("\\s+");
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));

        String nonRepeatingWord = wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First Non Repeating Word: "+nonRepeatingWord);
    }
}
