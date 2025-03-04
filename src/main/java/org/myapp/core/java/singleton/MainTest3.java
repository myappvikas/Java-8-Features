package org.myapp.core.java.singleton;

public class MainTest3 {

    public static void main(String[] args) {

        Runtime runtime2 = Runtime.getRuntime();
        Runtime runtime3 = Runtime.getRuntime();

        System.out.println(runtime2.hashCode());
        System.out.println(runtime3.hashCode());
    }
}
