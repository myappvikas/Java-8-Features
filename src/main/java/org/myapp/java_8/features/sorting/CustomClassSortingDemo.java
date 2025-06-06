package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CustomClassSortingDemo {

    public static void main(String[] args) {

       Arrays.asList(
                        new Employee( "vikas", 30,5000000.0d),
                        new Employee( "deepak", 28, 3000000.0d),
                        new Employee( "manoj", 35, 4000000d)
                ).stream().sorted(Comparator.comparing(Employee::name))
                .forEach(System.out::println);

        Arrays.asList(
                        new Employee( "vikas", 30,5000000.0d),
                        new Employee( "deepak", 28, 3000000.0d),
                        new Employee( "manoj", 35, 4000000d)
                ).stream().sorted((Comparator.comparing(Employee::age)).reversed())
                .forEach(System.out::println);

    }
}

record Employee(String name, Integer age, double salary) {
}
