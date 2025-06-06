package org.myapp.core.java.ambiguity;

/*Occurs when a class inherits default methods from multiple
interfaces that have the same method.*/

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    // show() is ambiguous unless overridden
    public void show() {
       A.super.show();  // Or B.super.show()
    }
}
