package org.myapp.interview.program_list_3;

import java.util.Arrays;

public class Program_17 {

    public static void main(String[] args) {

        int[] ints = {1,2,5,4,3};
        Arrays.stream(ints).boxed().sorted((e1, e2)->e2.compareTo(e1))
                .forEach(e-> System.out.print(e+" "));

        System.out.println();

        Arrays.parallelSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
