package org.myapp.interview.strings;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program10 {

    public static void main(String[] args) {

        String str = "ABBADZCBCAAAYY";

        // Count frequency of each character
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));

        // Sort by frequency (descending) and get the 2nd most repeated
        Optional<Character> secondMost = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder()))
                .skip(1) // skip the most repeated
                .map(Map.Entry::getKey)
                .findFirst();
        secondMost.ifPresent(c-> System.out.println("Second largest frequency of char: "+c));
    }
}
