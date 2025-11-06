package org.myapp.exception.handaling.method_overriding;

public class ExceptionTestDemo4 {

    public static void main(String[] args) {

        Parent4 p4 = new Child4();
        try {
            p4.msg();
        } catch (Exception e) {
			System.out.println(e.getMessage());
        }
    }
}

class Parent4 {
    void msg() throws Exception {
        System.out.println("Parent4");
    }
}

class Child4 extends Parent4 {
    void msg() {
        System.out.println("Child4");
    }
}