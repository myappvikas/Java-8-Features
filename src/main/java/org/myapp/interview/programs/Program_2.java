package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Program_2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double avg = list.stream().mapToDouble(i -> i).average().getAsDouble();
        System.out.println(avg);

        //example_2
        List<Integer> list_2 = Arrays.asList(1, 2, 3, 4, 5);
        double avg_2 = list_2.stream().map(i -> i * i).filter(i -> i > 5).mapToDouble(e -> e).average().getAsDouble();
        System.out.println(avg_2);

        //example_2
        double avg_3 = IntStream.range(1, 6).average().getAsDouble();
        System.out.println(avg_3);
    }
}
