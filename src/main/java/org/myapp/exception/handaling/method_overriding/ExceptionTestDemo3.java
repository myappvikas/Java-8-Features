package org.myapp.exception.handaling.method_overriding;

public class ExceptionTestDemo3 {

    public static void main(String[] args) {

        Parent3 p3 = new Child3();
        try {
            p3.msg();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Parent3 {
    void msg() throws Exception {
        System.out.println("Parant3");
    }
}

class Child3 extends Parent3 {
    void msg() throws Exception {
        System.out.println("Child3");
    }
}
