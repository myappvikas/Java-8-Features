package org.myapp.core.java.singleton;

//Eager Initialization (Thread-safe)
public class SingletonDemo_1 {

    private static final SingletonDemo_1 singletonDemo = new SingletonDemo_1();

    private SingletonDemo_1() {
    }

    public static SingletonDemo_1 getInstance() {
        return singletonDemo;
    }
}

//Pros: Simple, thread-safe.
//Cons: Instance is created even if it might not be used.
