package org.myapp.interview.program_list_3;

import org.myapp.core.java.string.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Program_16 {

    public static void main(String[] args) {

        Arrays.asList(
                new Employee(5,"vikas",35000d),
                new Employee(1,"deepak",10000d),
                new Employee(3,"uma",450000d)
        ).stream().sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);

    }
}
