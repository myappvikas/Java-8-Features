package org.myapp.interview.programs;

import java.util.*;
import java.util.stream.Collectors;

public class Program_5 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 2, 2, 3, 5, 3, 6, 11, 6, 11, 13);
        Map<Integer,List<Integer>> map = list.stream().filter(e-> Collections.frequency(list,e)>1)
                .collect(Collectors.groupingBy(e->e,Collectors.toList()));
        map.forEach((k,v)-> System.out.println(k+": "+v));

        //Program_2
        Map<Integer,Long> map_2 = list.stream().filter(e-> Collections.frequency(list,e)>1)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        map_2.forEach((k,v)-> System.out.println(k+": "+v));

        //Program_3
        Set<Integer> set = new HashSet<>();
        Set<Integer> set_2 = list.stream().filter(e -> !set.add(e))
                .collect(Collectors.toSet());
        set_2.forEach(e-> System.out.print(e+" "));
    }
}
