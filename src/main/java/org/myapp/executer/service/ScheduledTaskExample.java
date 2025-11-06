package org.myapp.executer.service;

import java.util.concurrent.*;

public class ScheduledTaskExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Scheduled task run at: "
                + System.currentTimeMillis());
       //scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}
