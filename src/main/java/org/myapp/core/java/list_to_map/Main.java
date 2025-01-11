package org.myapp.core.java.list_to_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "vikas", 30),
                new Employee(2, "deepak", 20),
                new Employee(3, "uma", 50)
        );

        list.stream().collect(Collectors.groupingBy(e->e.getId(),Collectors.toList()))
                .forEach((k,v)-> System.out.println(k+": "+v));
    }
}
