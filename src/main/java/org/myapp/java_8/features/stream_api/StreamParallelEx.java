package org.myapp.java_8.features.stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamParallelEx {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        intList.stream().parallel().forEach(System.out::println);

        System.out.println("-------------------------------");
        intList.parallelStream().forEach(System.out::println);
    }
}
