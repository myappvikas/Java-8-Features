package org.myapp.interview.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_4 {

    public static void main(String[] args) {

        String str = "java programming language java";
        String[] strArr = str.split(" ");
        List<String> list = Arrays.asList(strArr);
        list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).forEach((k, v) ->
                System.out.println(k + ": " + v)
        );
    }
}
