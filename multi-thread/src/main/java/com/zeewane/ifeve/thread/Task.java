package com.zeewane.ifeve.thread;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("task sleep 1 second");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
