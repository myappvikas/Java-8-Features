package org.myapp.java_8.features.custome_functional_interface;

public class FunctionDemo {

    public static void main(String[] args) {
        MyFunction<Integer,Integer> myFunction = (a)-> a * a;
        int result = myFunction.apply(10);
        System.out.println(result);
    }
}

interface MyFunction<T, R> {
    R apply(T a);
}