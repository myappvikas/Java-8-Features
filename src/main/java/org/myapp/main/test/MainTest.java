package org.myapp.main.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        List<Customer> list = Arrays.asList(
                new Customer("XXXXX"),
                new Customer("YYYYY"),
                new Customer("AAAAA"),
                new Customer("BBBBB"),
                new Customer("MMMMM")
        );
        //Collections.sort(list, new CustomerNameComparator());
        list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
        //System.out.println(list);
    }
}
