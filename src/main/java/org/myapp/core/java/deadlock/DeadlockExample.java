package org.myapp.core.java.deadlock;

public class DeadlockExample {

    // Two resource objects
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        // Thread 1 tries to lock Lock1 then Lock2
        Thread thread1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding Lock1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 1: Waiting for Lock2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding Lock1 and Lock2...");
                }
            }
        });

        // Thread 2 tries to lock Lock2 then Lock1
        Thread thread2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding Lock2...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2: Waiting for Lock1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding Lock2 and Lock1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
