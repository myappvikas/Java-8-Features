package org.myapp.interview.programs;


import java.util.*;
import java.util.stream.Collectors;

public class Program_15 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> list2 = Arrays.asList("banana", "cherry", "fig", "grape", "apple");

        List<String> commonElements = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println("Common Elements: " + commonElements);
    }
}

