package org.myapp.interview.program_list_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Program_6 {

    public static void main(String[] args) {

        String input = "swiss";
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()));

        // Find the first character with a count of 1
        char firstNonRepeatingChar = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First NonRepeating Character: " + firstNonRepeatingChar);
    }
}
