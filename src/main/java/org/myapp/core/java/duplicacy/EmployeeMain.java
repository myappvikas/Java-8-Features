package org.myapp.core.java.duplicacy;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "vikas", 10000d),
                new Employee(1, "vikas", 10000d)
        );
        list.stream().distinct().forEach(System.out::println);
    }
}

record Employee(int id, String name,double salary){}
