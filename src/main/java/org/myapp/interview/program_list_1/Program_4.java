package org.myapp.interview.program_list_1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Program_4 {

    public static void main(String[] args) {

        String str = "java programming language java c++";
        String[] strArr = str.split("\\s+");
        Arrays.stream(strArr).collect(Collectors.groupingBy(s -> s,
                        LinkedHashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
