package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program_9 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 22, 33, 4, 55, 6, 7, 8, 9);
        int secondHighest = list.stream().sorted(Comparator.reverseOrder()).distinct()
                .limit(2).skip(1).findFirst().get();
        System.out.println(secondHighest);

        //Program_2
        int secondHighest_2 = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighest_2);

    }
}
