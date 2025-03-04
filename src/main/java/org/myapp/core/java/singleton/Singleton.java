package org.myapp.core.java.singleton;

import java.lang.reflect.Constructor;

public class Singleton implements Cloneable {

    private static volatile Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton instance is not allowed");
    }

    // Method to create another instance using reflection
    public static Singleton createInstanceUsingReflection() {
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Testing singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 hashcode: " + instance1.hashCode());
        System.out.println("instance2 hashcode: " + instance2.hashCode());

        // Testing reflection to create another instance
        Singleton instance3 = Singleton.createInstanceUsingReflection();
        System.out.println("instance3 hashcode: " + instance3.hashCode());

        // Testing cloning
        try {
            Singleton instance4 = (Singleton) instance1.clone();
            System.out.println("instance4 hashcode: " + instance4.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
