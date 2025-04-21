package org.myapp.interview.program_list_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        Customer c_1 = new Customer("vikas");
        Customer c_2 = new Customer("kumar");
        Customer c_3 = new Customer("gupta");

        List<Customer> list = Arrays.asList(c_1, c_2, c_3);

        Collections.sort(list, new CustomerNameComparator());
        System.out.println(list);
    }
}
