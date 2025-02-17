package org.myapp.interview.programs;

public class Program_14 {

    public static void main(String[] args) {

        String str = "aabccd";
        str.chars().mapToObj(c -> (char) c).distinct().forEach(c -> System.out.print(c));
    }
}
