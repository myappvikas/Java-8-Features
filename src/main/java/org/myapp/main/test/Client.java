package org.myapp.main.test;

public class Client {

    public static void main(String[] args) {

        SingletonDemo2 singletonDemo1 = SingletonDemo2.getSingletonDemo2();
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getSingletonDemo2();
        System.out.println(singletonDemo1==singletonDemo2);
        System.out.println(singletonDemo1.hashCode());
        System.out.println(singletonDemo2.hashCode());
    }
}
