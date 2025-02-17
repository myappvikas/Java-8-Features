package org.myapp.interview.programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_10 {

    public static void main(String[] args) {

        Stream.of("sssss", "ssss", "sss", "ss", "s", "aaaaa").filter(e -> e.startsWith("s"))
                .peek(e -> System.out.println(e)).collect(Collectors.toList());
    }
}
