package org.myapp.interview.program_list_3;

public class Program_14 {

    public static void main(String[] args) {

        String str = "aabccd";
        str.chars().mapToObj(c -> (char) c).distinct().forEach(c -> System.out.print(c));
        //char c = str.chars().mapToObj(e -> (char) e).distinct().findFirst().get();
        //System.out.println(c);
    }
}
