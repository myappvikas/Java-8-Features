package org.myapp.interview.programs;

import java.util.stream.IntStream;

public class Program_12 {

    public static void main(String[] args) {

        IntStream.range(1,11).filter(i->i%2==0).forEach(i-> System.out.print(i+" "));
    }
}
