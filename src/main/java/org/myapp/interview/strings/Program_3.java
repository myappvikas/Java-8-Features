package org.myapp.interview.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Program_3 {

    public static void main(String[] args) {

        String str = "swiss";
        Map<Character, Long> map = str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
