package org.myapp.exception.handaling.finaly;

public class FinallyBlockDemo2 {

    public static void main(String[] args) {

        try {
            int data = 25 / 0;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of code here");
    }
}
