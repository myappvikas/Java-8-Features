package org.myapp.core.java.ambiguity;

/*Occurs when a class inherits default methods from multiple
interfaces that have the same method.*/

public class MultipleInheritanceDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.show();
    }
}

interface M {
    default void show() {
        System.out.println("Interface M show method");
    }
}

interface N {
    default void show() {
        System.out.println("Interface N show method");
    }
}

class Client implements M, N {
    // show() is ambiguous unless overridden
    public void show() {
        N.super.show();  // Or B.super.show()
    }
}

