package org.myapp.core.java.singleton;

//6. Enum SingletonDemo (Best for Serialization Safety)
public enum SingletonDemo_6 {
    INSTANCE;

    public void someMethod() {
        // your logic here
    }
}

//Pros: Thread-safe, serialization-safe, reflection-safe.
//Cons: Enum syntax might not feel intuitive for all cases.


