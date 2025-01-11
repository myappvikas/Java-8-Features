package org.myapp.main.test;

public class SingletonDemo1 {

    private static final SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    private SingletonDemo1(){}

    public static synchronized SingletonDemo1 getSingletonDemo1(){
        return singletonDemo1;
    }
}
