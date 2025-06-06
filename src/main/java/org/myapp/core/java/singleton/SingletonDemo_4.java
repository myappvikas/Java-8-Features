package org.myapp.core.java.singleton;

//4. Double-Checked Locking (Recommended)
public class SingletonDemo_4 {
    private static volatile SingletonDemo_4 instance;

    private SingletonDemo_4() {}

    public static SingletonDemo_4 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo_4.class) {
                if (instance == null) {
                    instance = new SingletonDemo_4();
                }
            }
        }
        return instance;
    }
}

//Pros: Thread-safe, good performance.
//Cons: Slightly more complex code.