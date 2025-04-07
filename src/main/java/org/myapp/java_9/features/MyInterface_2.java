package org.myapp.java_9.features;

public interface MyInterface_2 {

    default void method_1(){
        System.out.println("Starting method method_1");
        shareLogic();
        System.out.println("Ending method method_1");
    }
    default void method_2(){
        System.out.println("Starting method method_2");
        shareLogic();
        System.out.println("Ending method method_2");
    }
    private void shareLogic(){
        System.out.println("Shared logic");
    }
}
