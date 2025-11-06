package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.Comparator;


public class Program18 {

    private static final Logger log = LoggerFactory.getLogger(Program18.class);

    public static void main(String[] args) {

        var customerList = Arrays.asList(
                new Customer(1, "vikas", 35),
                new Customer(3, "manoj", 30),
                new Customer(2, "suresh", 22),
                new Customer(4, "uma", 45),
                new Customer(5, "ram", 48)
        );
        var sortedList = customerList
                .stream()
                .sorted(Comparator.comparing(Customer::age)
                        .reversed())
                .toList();
        sortedList.forEach(System.out::println);
        log.info("Customers sorted by age in descending order: {}", sortedList);
    }
}

