package org.myapp.collection.framework.map;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(104, "vikas");
        treeMap.put(101, "deepak");
        treeMap.put(103, "amrish");
        treeMap.put(102, "sunil");
        treeMap.put(105, "uma");
        System.out.println(treeMap);
    }
}
