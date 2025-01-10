package org.myapp.interview.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,4,3,5,6,7,7,6,9,8,7);

       Map<Integer,Long> map =  list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.groupingBy(e->e,
                Collectors.counting()));
       map.forEach((k,v)-> System.out.println(k+": "+v));


    }
}
