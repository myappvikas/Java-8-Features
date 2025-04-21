package org.myapp.interview.program_list_1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Program_5 {

    public static void main(String[] args) {

        String input = "vikas kumar gupta kumar vikas";

        // Split the input into words (assuming words are space-separated)
        String[] words = input.split("\\s+");

        // Use LinkedHashMap to maintain insertion order
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));

        // Find the first word with a count of 1
        String nonRepeatingWord = wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First Non Repeating Word: "+nonRepeatingWord);
    }
}
