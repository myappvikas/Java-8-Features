package org.myapp.core.java.singleton;

// 3. Thread-safe SingletonDemo with Synchronized Method
public class SingletonDemo_3 {
    private static SingletonDemo_3 instance;

    private SingletonDemo_3() {
    }

    public static synchronized SingletonDemo_3 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo_3();
        }
        return instance;
    }
}

//Pros: Thread-safe.
//Cons: Synchronization reduces performance
