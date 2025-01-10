package org.myapp.core.java.ambiguity;

public interface AmbiguityDemo_2 {

    public static void sum(int a, long b) {
        System.out.println("Sum of int and long value :" + (a + b));
    }

    public static void sum(long a, int b) {
        System.out.println("Sum of long and int value :" + (a + b));
    }

    public static void main(String[] args) {
        //AmbiguityDemo.sum(10, 20);

        //Solution.
        AmbiguityDemo_2.sum(10, 20l);
    }
}
