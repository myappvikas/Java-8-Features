package org.myapp.java_8.features.custome_functional_interface;

public class ConsumerDemo {

    public static void main(String[] args) {
        MyConsumer<String> myConsumer = name -> System.out.println("Hallo! "+name);
        myConsumer.accept("Vikas");
    }
}

interface MyConsumer<T> {
    void accept(T t);
}