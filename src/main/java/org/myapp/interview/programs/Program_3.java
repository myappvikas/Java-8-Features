package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("All even numbers "+evenNumbers);

        List<Integer> lis_2t = Arrays.asList(1,2,3,4,5);
        List<Integer> oddNumbers = list.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println("All even numbers "+oddNumbers);
    }
}
