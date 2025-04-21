package org.myapp.interview.program_list_1;

import java.util.Map;
import java.util.stream.Collectors;

public class Program_3 {

    public static void main(String[] args) {

        String str = "JavaJavaEE";
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
