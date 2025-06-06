package org.myapp.interview.program_list_1;

import java.util.List;
import java.util.stream.Collectors;

public class Program_8 {

    public static void main(String[] args) {

        String input = "vikas";

        // Convert to lowercase and use stream to filter vowels
        List<Character> vowels = input.toLowerCase()
                .chars() // IntStream of character codes
                .mapToObj(c -> (char) c) // Convert to Character stream
                .filter(c -> "aeiou".indexOf(c) != -1) // Keep only vowels
                .collect(Collectors.toList());

        System.out.println("Vowels in the string:");
        vowels.forEach(System.out::println);
    }
}
