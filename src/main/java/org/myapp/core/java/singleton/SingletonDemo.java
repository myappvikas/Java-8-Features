package org.myapp.core.java.singleton;

import java.io.Serial;

public final class SingletonDemo {

    // Use volatile to guarantee that any thread reading a variable sees
    // the most recent value written by another thread, ensuring safe
    // and consistent visibility of shared data across threads.
    private static volatile SingletonDemo instance;

    // Private constructor
    private SingletonDemo() {
        // Prevent reflection from creating a new instance
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    // Thread-safe, double-checked locking
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed for singleton");
    }
}
