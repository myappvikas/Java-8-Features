package org.myapp.interview.list_of_custome_objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {

    private static final Logger log = LoggerFactory.getLogger(EmployeeDemo.class);

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
        //Employees group based on department
        Map<String, List<Employee>> employees = list.stream()
                .collect(Collectors.groupingBy(Employee::deptName, Collectors.toList()));
        employees.forEach((key, value) -> log.info("{}: {}", key, value));


        //Employees count based on department
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Employee::deptName, Collectors.counting()));
        map.forEach((key, value) -> log.info("{}: {}", key, value));


        //Active and Inactive employees
        List<Employee> active = list.stream().filter(e -> e.status().equals("A"))
                .toList();
        active.forEach(employee -> log.info("Active employee: {}", employee));

        List<Employee> inactive = list.stream().filter(e -> e.status().equals("N"))
                .toList();
        inactive.forEach(employee -> log.info("Inactive employee: {}", employee));

        //Min and Max salary of employees
        Optional<Employee> minSalary = list.stream().min(Comparator.comparing(Employee::salary));
        minSalary.ifPresent(employee -> log.info("Employee who is getting min salary: {}", employee));

        Optional<Employee> maxSalary = list.stream().max(Comparator.comparing(Employee::salary));
        maxSalary.ifPresent(employee -> log.info("Employee who is getting max salary: {}", employee));

        //Employees whose salary are greater in each department
        Map<String, Optional<Employee>> groupBasedOnSalary = list.stream().collect(Collectors
                .groupingBy(Employee::deptName,
                Collectors.maxBy(Comparator.comparing(Employee::deptName))));
        groupBasedOnSalary.forEach((k, v) -> log.info("Employees whose salary are greater in each department: {}, {}", k, v));

        //Group of deportment and list of employee name
        Map<String, List<String>> map2 = list.stream()
                .collect(Collectors.groupingBy(Employee::deptName,
                        Collectors.mapping(Employee::empName, Collectors.toList())));
        map2.forEach((k, v) -> log.info("Map of deportment and list of employee name: {}, {}", k, v));
    }
}
