package org.myapp.interview.strings;

import java.util.Map;

public class Program_7 {

    public static void main(String[] args) {

        Map<Integer, Employee> map = Map.of(
                1, new Employee(109, "vikas", 35, 100000d),
                2, new Employee(104, "deepak", 25, 500000d),
                3, new Employee(101, "ram", 28, 900000d),
                4, new Employee(103, "uma", 45, 300000d),
                5, new Employee(105, "Ambrish", 29, 700000d)
        );
        map.entrySet().stream().filter(entry -> entry.getValue().age() > 28)
                .filter(entry->entry.getValue().salary()>100000d)
                .map(entry->entry.getValue().name())
                .forEach(System.out::println);
    }
}

record Employee(int id, String name, int age, double salary) {
}
