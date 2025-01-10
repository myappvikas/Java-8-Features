package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program_6 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,7,3,2,9,8);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        int min_2 = list.stream().min((e1,e2)->e1.compareTo(e2)).get();
        System.out.println(min);
    }
}
