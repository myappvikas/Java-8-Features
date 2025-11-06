package org.myapp.interview.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Program_9 {

    public static void main(String[] args) {

        int[] ints = {1,2,3,2,4,6,7,5,6,9};
        int[] sortedArray = Arrays.stream(ints)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sortedArray));
    }
}
