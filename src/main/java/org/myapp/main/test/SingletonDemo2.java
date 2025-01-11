package org.myapp.main.test;

public class SingletonDemo2 {
    private static SingletonDemo2 singletonDemo2 = null;

    private SingletonDemo2(){}

    public static SingletonDemo2 getSingletonDemo2(){
        if(singletonDemo2==null)
           return singletonDemo2 = new SingletonDemo2();
        else return singletonDemo2;
    }
}
