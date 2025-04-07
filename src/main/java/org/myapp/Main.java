package org.myapp;

import java.lang.reflect.Constructor;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

    }
}

class Singleton implements Cloneable {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static Singleton getSingletonUsingReflection() {
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

