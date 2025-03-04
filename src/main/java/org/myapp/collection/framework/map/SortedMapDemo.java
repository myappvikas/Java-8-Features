package org.myapp.collection.framework.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(104, "vikas");
        treeMap.put(101, "deepak");
        treeMap.put(103, "amrish");
        treeMap.put(102, "sunil");
        treeMap.put(105, "uma");
        System.out.println(treeMap.headMap(102));
        System.out.println(treeMap.tailMap(102));
        System.out.println(treeMap.subMap(100, 102));
    }
}
