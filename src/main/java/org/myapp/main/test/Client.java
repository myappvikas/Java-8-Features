package org.myapp.main.test;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        Stream.iterate(new int[]{0,1},e->new int[]{e[1],e[0]+e[1]})
                .limit(10)
                .map(e->e[0])
                .forEach(e-> System.out.print(e+" "));
    }
}
