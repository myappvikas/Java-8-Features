package org.myapp.java_11.features.string;

import java.util.function.Function;

public class Changes_In_Lambda_Expression {

    public static void main(String[] args) {

        //Function<String, Integer> f1 = (var s)->(s.length());
        Function<String, Integer> f2 = (var s)->(s.length());
        System.out.println(f2.apply("vikas"));
    }
}
