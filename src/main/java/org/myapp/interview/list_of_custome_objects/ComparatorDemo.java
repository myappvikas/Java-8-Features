package org.myapp.interview.list_of_custome_objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    private static final Logger log = LoggerFactory.getLogger(ComparatorDemo.class);

    public static void main(String[] args) {

        Customer c1 = new Customer("vikas");
        Customer c2 = new Customer("kumar");
        Customer c3 = new Customer("gupta");
        List<Customer> list = Arrays.asList(c1, c2, c3);
        list.sort(new CustomerNameComparator());
        log.info("Shorted List, {}",list);
    }
}
