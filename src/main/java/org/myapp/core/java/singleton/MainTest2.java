package org.myapp.core.java.singleton;

public class MainTest2 {

    public static void main(String[] args) {

        Test2 test1 = Test2.getTest();
        Test2 test2 = Test2.getTest();

        System.out.println(test2.hashCode());
        System.out.println(test1.hashCode());
    }
}
