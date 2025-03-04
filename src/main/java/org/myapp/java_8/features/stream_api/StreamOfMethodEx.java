package org.myapp.java_8.features.stream_api;

import java.util.stream.Stream;

public class StreamOfMethodEx {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(9, 99, 999, 9999, 99999);
        stream.forEach(System.out::println);

        System.out.println("-----------------------");
        Stream<String> strStream = Stream.of("vikas", "deepak", "ambrish", "uma");
        strStream.forEach(System.out::println);

        System.out.println("-----------------------");
        Integer[] intArray = {1, 11, 111, 1111, 11111};
        Stream.of(intArray).forEach(System.out::println);
    }

}
