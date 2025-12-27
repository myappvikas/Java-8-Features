package org.myapp.interview.strings;

import java.util.stream.Collectors;

public class Program7 {

    public static void main(String[] args) {

        String string = "vIkas";

        // Convert to lowercase and use stream to filter vowels
        String vowels = string
                .chars() // IntStream of character codes
                .mapToObj(c -> (char) c) // Convert to Character stream
                .filter(c -> "aeiouAEIOU".indexOf(c) >= 0) // Keep only vowels
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Vowels in the string: "+vowels);
    }
}
