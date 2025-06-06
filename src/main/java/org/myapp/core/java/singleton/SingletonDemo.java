package org.myapp.core.java.singleton;

import java.lang.reflect.Constructor;

public class SingletonDemo implements Cloneable {

    private static volatile SingletonDemo instance;

    private SingletonDemo() {
        if(instance != null){
            throw new RuntimeException("Instance of this class already has been created");
        }
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton instance is not allowed");
    }

    // Method to create another instance using reflection
    public static SingletonDemo createInstanceUsingReflection() {
        try {
            Constructor<SingletonDemo> constructor = SingletonDemo.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Testing singleton instance
        SingletonDemo instance1 = SingletonDemo.getInstance();
        SingletonDemo instance2 = SingletonDemo.getInstance();

        System.out.println("instance1 hashcode: " + instance1.hashCode());
        System.out.println("instance2 hashcode: " + instance2.hashCode());

        // Testing reflection to create another instance
        SingletonDemo instance3 = SingletonDemo.createInstanceUsingReflection();
        System.out.println("instance3 hashcode: " + instance3.hashCode());

        // Testing cloning
        try {
            SingletonDemo instance4 = (SingletonDemo) instance1.clone();
            System.out.println("instance4 hashcode: " + instance4.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
