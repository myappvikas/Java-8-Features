package org.myapp.interview.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_2 {

    public static void main(String[] args) {

        String str = "java programming language java c++";
        String[] strings = str.split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
