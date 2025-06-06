package org.myapp.core.java.singleton;

//2. Lazy Initialization (Not Thread-safe)
public class SingletonDemo_2 {
    private static SingletonDemo_2 instance;

    private SingletonDemo_2() {
    }

    public static SingletonDemo_2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo_2();
        }
        return instance;
    }
}

//Pros: Instance is created only when needed.
//Cons: Not thread-safe — may create multiple instances in a multithreaded environment.


