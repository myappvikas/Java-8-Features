package org.myapp.interview.list_of_custome_objects;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return c2.getName().compareTo(c1.getName());
    }
}
