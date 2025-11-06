package org.myapp.exception.handaling.method_overriding;

public class ExceptionTestDemo2 {

    public static void main(String[] args) {

        //Parent2 p2 = new Child2();
        //p2.msg();
    }

}

class Parent2 {
    void msg()throws ArithmeticException {
    	System.out.println("Parent2");
    }
}

class Child2 extends Parent2 {
    /*void msg() throws Exception {
        System.out.println("Child2");
    }*/
}
