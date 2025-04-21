package org.myapp.executer.service;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Hello from Callable";
        };
        Future<String> future = executor.submit(task);
        System.out.println("Result: " + future.get()); // blocks until result is ready
        executor.shutdown();
    }
}
