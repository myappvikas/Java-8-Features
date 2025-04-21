package org.myapp.interview.program_list_2;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer customer_1, Customer customer_2) {
        return customer_1.getName().compareTo(customer_2.getName());
    }
}
