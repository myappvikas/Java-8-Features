package org.myapp.exception.handaling.method_overriding;

import java.io.IOException;

public class ExceptionTestDemo {

    public static void main(String[] args) {

        //Parent p = new Child();
        //p.msg();
    }
}

class Parent {
    //void msg() {
    //System.out.println("Parent");
    //}
}

class Child extends Parent {
    void msg() throws IOException {
        System.out.println("Child");
    }
}
