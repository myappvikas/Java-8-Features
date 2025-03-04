package org.myapp.collection.framework.list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add(2);
        list.add(null);
        list.add(null);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.add(2, 100);
        System.out.println(list);

        list.add(34);
        System.out.println(list);

        System.out.println(list.contains(34));


        ArrayList<Employee> list2 = new ArrayList<>();

        list2.add(null);
        list2.add(null);
        list2.add(new Employee(101, "sonu"));
        list2.add(new Employee(102, "monu"));
        list2.add(new Employee(103, "konu"));
        list2.add(new Employee(104, "uma"));

        System.out.println(list2);
    }
}
