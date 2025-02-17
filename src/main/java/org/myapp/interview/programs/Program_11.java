package org.myapp.interview.programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_11 {

    public static void main(String[] args) {

        Stream.of("vikas","manoj","uma","ram")
                .collect(Collectors.groupingBy(e->e.length(),Collectors.toList()))
                .forEach((k,v)-> System.out.println(k+": "+v));

    }
}
