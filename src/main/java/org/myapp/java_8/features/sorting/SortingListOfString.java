package org.myapp.java_8.features.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListOfString {

    public static void main(String[] args) {

        var strList = Arrays.asList("vikas", "deepak", "pankaj", "manoj", "ram",
                "shyam", "sunil");

        //Method 1.
        strList.sort(Comparator.comparing(String::valueOf));
        System.out.println(strList);

        // Method 2.
        Collections.sort(strList);
        System.out.println(strList);

        // Method 3.
        Collections.sort(strList,Comparator.reverseOrder());
        System.out.println(strList);

        // Method 5.
        var strList2 = strList.stream()
                .sorted().collect(Collectors.toList());
        strList2.forEach(System.out::println);

        // Method 6.
        var strList3 = strList.stream().sorted(Collections
                .reverseOrder()).collect(Collectors.toList());
        strList3.forEach(System.out::println);

        // Method 7.
        var strList4 = strList.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        strList4.forEach(System.out::println);
    }
}
