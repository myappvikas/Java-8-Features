package org.myapp.collection.framework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("");
        linkedList.add("");
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("AA");
        linkedList.add("AA");
        linkedList.add("BB");
        linkedList.add("CC");
        linkedList.add("DD");

        Iterator<String> itr = linkedList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(linkedList);
    }
}
