package org.myapp.collection.framework.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add(null);
        set.add(null);
        set.add("");
        set.add("");
        System.out.println(set);
    }
}
