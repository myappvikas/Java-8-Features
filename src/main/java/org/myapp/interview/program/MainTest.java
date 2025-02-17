package org.myapp.interview.program;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(101, "Vikas", 1001, "HR", "A", 500000d),
                new Employee(102, "Vikas Kumar", 1001, "HR", "N", 300000d),
                new Employee(103, "Deepak", 1002, "FN", "N", 600000d),
                new Employee(104, "Deepak Kumar", 1002, "FN", "N", 400000d),
                new Employee(105, "Rahul", 1003, "SL", "A", 900000d),
                new Employee(106, "Rahul Kumar", 1003, "SL", "N", 100000d),
                new Employee(107, "Uma", 1004, "MG", "A", 3500000d)
        );

        list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                .forEach((k,v)-> System.out.println(k+": "+v));
    }
}
