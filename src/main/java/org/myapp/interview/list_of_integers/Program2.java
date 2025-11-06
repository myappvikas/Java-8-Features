package org.myapp.interview.list_of_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Program2 {

    private static final Logger log = LoggerFactory.getLogger(Program2.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble optional = list.stream().mapToDouble(Double::valueOf).average();
        if(optional.isPresent()) {
            log.info("Average of all numbers: {}", optional.getAsDouble());
        }

        //example 2
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble optionalDouble = list2.stream().map(i -> i * i).filter(i -> i > 5)
                .mapToDouble(e -> e).average();
        if(optionalDouble.isPresent()) {
            log.info("Average of numbers: {}", optionalDouble.getAsDouble());
        }

        //example 3
        OptionalDouble optionalDouble1 = IntStream.range(1, 6).average();
        if(optionalDouble1.isPresent()) {
            log.info("Average of all numbers: {}", optionalDouble1.getAsDouble());
        }
    }
}
