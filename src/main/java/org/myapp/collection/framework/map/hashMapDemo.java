package org.myapp.collection.framework.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class hashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Vikas");
        map.put(5, "Deepak");
        map.put(3, "Ambrish");
        map.put(4, "Sonu");
        map.put(2, "Monu");
        System.out.println(map);
    }
}
