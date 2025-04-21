package org.myapp.interview.program_list_1;

import java.util.HashMap;
import java.util.Map;

public class Program_2 {

    public static void main(String[] args) {

        String str = "java programming language java";
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strArr) {
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
