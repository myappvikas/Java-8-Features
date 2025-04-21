package org.myapp.interview.program_list_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program_7 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 30, 20, 7, 50, 40, 40, -40, 700, 400);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //Program_2
        List<Integer> sortedList_2 = list.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList_2);

        //Program_3
        List<Integer> sortedList_3 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList_3);
    }
}
