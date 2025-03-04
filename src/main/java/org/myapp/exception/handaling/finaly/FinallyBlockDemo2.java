package org.myapp.exception.handaling.finaly;

public class FinallyBlockDemo2 {

    public static void main(String[] args) {

        try {
            int data = 25 / 0;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of code here");
    }
}
