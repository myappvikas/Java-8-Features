package org.myapp.interview.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerComparatorDemo {

    public static void main(String[] args) {

        Customer c_1 = new Customer("vikas");
        Customer c_2 = new Customer("kumar");
        Customer c_3 = new Customer("gupta");

        List<Customer> list = Arrays.asList(c_1, c_2, c_3);

        Collections.sort(list, new CustomerNameComparator());
        System.out.println(list);
    }
}
