package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.List;

public class Program_1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream().reduce((a,b)->a+b).get();
        System.out.println("Sum of all numbers: "+sum);
    }
}
