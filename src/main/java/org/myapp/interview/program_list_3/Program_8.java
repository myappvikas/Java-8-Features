package org.myapp.interview.program_list_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list_2 = list.stream().limit(4).collect(Collectors.toList());
        System.out.println(list_2);

        List<Integer> list_3 = list.stream().skip(4).collect(Collectors.toList());
        System.out.println(list_3);

        List<Integer> list_4 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list_4);

        long count = list.stream().distinct().count();
        System.out.println(count);

    }
}
