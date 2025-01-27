package org.myapp.interview.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(32,34,54,36,44,88,99,66,77,88);
        int sh = list.stream().sorted(Comparator.comparing(Integer::valueOf)).distinct()
                .limit(2).skip(1).findFirst().get();
        System.out.println(sh);

    }
}
