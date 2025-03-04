package org.myapp.collection.framework.map;

import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "AA");
        hashTable.put(2, "BB");
        hashTable.put(3, null);
        hashTable.put(null, null);
        hashTable.put(5, "EE");
        System.out.println(hashTable);
    }
}
