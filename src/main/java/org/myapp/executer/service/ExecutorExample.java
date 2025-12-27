package org.myapp.executer.service;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
            Runnable task = () -> System.out.println("Task executed by: " +
                    Thread.currentThread()
                    .getName());
            for (int i = 0; i < 5; i++) {
                executor.submit(task);
            }
            executor.shutdown(); // Initiates an orderly shutdown
        }
    }
}