package org.myapp.interview.program_list_1;

import java.util.HashMap;
import java.util.Map;

public class Program_1 {
    public static void main(String[] args) {

        String str = "JavaJavaEE";
        char[] chArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
