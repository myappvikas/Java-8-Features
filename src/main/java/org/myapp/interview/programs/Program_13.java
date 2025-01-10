package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program_13 {

    public static void main(String[] args) {

        List<Integer> list_1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list_2 = Arrays.asList(6,7,8,9);
        Stream.concat(list_1.stream(),list_2.stream()).forEach(e-> System.out.print(e+" "));

        System.out.println();

        //Program_2
        Stream st_1 = Stream.of(1,2,3,4,5);
        Stream st_2 = Stream.of(6,7,8,9);
        Stream.concat(st_1,st_2).forEach(e-> System.out.print(e+" "));

        System.out.println();

        // Creating more than two Streams
        Stream<String> stream1 = Stream.of("Varanasi","Mau");
        Stream<String> stream2 = Stream.of("UP","Gorakhpur");
        Stream<String> stream3 = Stream.of("Ghaziabad","Mumbai");
        Stream<String> stream4 = Stream.of("Delhi","Kanpur");

        // concatenating all the Streams
        // with Stream.concat() function
        // and displaying the result
        Stream.concat(Stream.concat(Stream.concat(stream1,
                        stream2), stream3), stream4)
                .forEach(e -> System.out.print(e+" "));
    }
}
