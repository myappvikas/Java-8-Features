package org.myapp.collection.framework.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<String> tst = new TreeSet<>();
        tst.add(null);
        tst.add("");
        tst.add("");
        tst.add("AA");
        tst.add("AAAA");
        tst.add("AAA");
        tst.add("AAAAA");
        tst.add("A");
        System.out.println(tst);
    }
}
