package org.myapp.java_9.features;

public interface MyInterface {

    default void method_1(){
        System.out.println("Starting method method_1");
        System.out.println("Shared logic");
        System.out.println("Ending method method_1");
    }
    default void method_2(){
        System.out.println("Starting method method_2");
        System.out.println("Shared logic");
        System.out.println("Ending method method_2");
    }
}
