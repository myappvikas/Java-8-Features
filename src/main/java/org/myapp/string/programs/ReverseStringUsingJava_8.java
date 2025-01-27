package org.myapp.string.programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJava_8 {

    public static void main(String[] args) {

        String original = "vikas";

        // Reverse the string using Java 8 Streams
        String reversed = IntStream.range(0, original.length())
                .mapToObj(i -> original.charAt(original.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

    }
}
