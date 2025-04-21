package org.myapp.interview.program_list_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(555, 55555, 123, 234, 453, 55);
        List<Integer> resultList = list
                .stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("5"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
