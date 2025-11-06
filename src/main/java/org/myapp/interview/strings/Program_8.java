package org.myapp.interview.strings;

import java.util.stream.Collectors;

public class Program_8 {

    public static void main(String[] args) {

        String string = "vikas";

        // Convert to lowercase and use stream to filter vowels
        String vowels = string.toLowerCase()
                .chars() // IntStream of character codes
                .mapToObj(c -> (char) c) // Convert to Character stream
                .filter(c -> "aeiou".indexOf(c) != -1) // Keep only vowels
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Vowels in the string: "+vowels);
    }
}
