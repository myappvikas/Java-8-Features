package org.myapp.collection.framework.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(null);
        set.add(null);
        set.add(0);
        set.add(0);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(6);
        System.out.println(set);
    }
}
