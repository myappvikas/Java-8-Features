package org.myapp.interview.program;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {

        String str = "vikasvikgu";
        char[] chArr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c:chArr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
