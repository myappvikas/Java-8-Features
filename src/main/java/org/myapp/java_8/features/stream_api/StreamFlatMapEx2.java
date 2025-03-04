package org.myapp.java_8.features.stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFlatMapEx2 {

    public static void main(String[] args) {

        List<List<Employee>> listOfList = new ArrayList<>();

        listOfList.add(Arrays.asList(new Employee(1, "vikas", 20, 50000d),
                new Employee(2, "deepak", 28, 20000d)));

        listOfList.add(Arrays.asList(new Employee(3, "ambrish", 30, 15000d),
                new Employee(4, "uma", 35, 80000d)));

        System.out.println(listOfList);

        List<Employee> newList = listOfList.stream().flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(newList);

        newList.forEach(System.out::println);

        newList.forEach(e -> System.out.println(e));
    }
}
