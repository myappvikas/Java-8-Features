package org.myapp.interview.program;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program_5 {

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
        //Employees based on department
        Map<String,List<Employee>> employees = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.toList()));
        employees.forEach((k,v)-> System.out.println(k+": "+v));

        System.out.println("Employees count based on department");
        Map<String,Long> count = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        count.forEach((k,v)-> System.out.println(k+": "+v));

        System.out.println("Active and Inactive employees");
        List<Employee> active = list.stream().filter(e->e.getStatus().equals("A"))
                .collect(Collectors.toList());
        active.forEach(System.out::println);

        List<Employee> inactive = list.stream().filter(e->e.getStatus().equals("N"))
                .collect(Collectors.toList());
        inactive.forEach(System.out::println);

        System.out.println("min and max employee salary");
        Employee minSalary = list.stream().min((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
        System.out.println(minSalary);

        Employee maxSalary = list.stream().max((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
        System.out.println(maxSalary);

        System.out.println("Employee whose salary is greater in each department");
        Map<String, Optional<Employee>> groupBasedOnSalary = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        groupBasedOnSalary.forEach((k,v)-> System.out.println(k+": "+v));
    }
}
