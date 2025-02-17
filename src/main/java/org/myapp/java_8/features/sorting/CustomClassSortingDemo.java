package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CustomClassSortingDemo {

    public static void main(String[] args) {

        Arrays.asList(
                new Employee(3,"vikas",30),
                new Employee(5,"deepak",28),
                new Employee(2,"manoj",35)
        ).stream().sorted(Comparator.comparing(Employee::name))
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        Arrays.asList(
                        new Employee(3,"ssss",30),
                        new Employee(5,"aaaa",28),
                        new Employee(2,"zzzz",35)
                ).stream().sorted((e1,e2)->e2.name().compareTo(e1.name()))
                .forEach(System.out::println);
    }
}

record Employee(Integer id, String name, Integer age){ }
