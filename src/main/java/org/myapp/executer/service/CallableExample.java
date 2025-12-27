package org.myapp.executer.service;

import java.util.concurrent.*;

public class CallableExample {

    static void main() throws Exception {

        try(ExecutorService executor = Executors.newSingleThreadExecutor()) {
            Callable<String> task = () -> {
                Thread.sleep(1000);
                return "Hello from Callable";
            };
            for (int i = 0; i < 5; i++) {
                System.out.println(executor.submit(task).get());
            }
            executor.shutdown();
        }
    }
}
