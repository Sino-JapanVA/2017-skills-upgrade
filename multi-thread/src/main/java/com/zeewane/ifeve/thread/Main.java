package com.zeewane.ifeve.thread;

public class Main {

    public static void main(String[] args) {
        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();

        Thread thread;
        System.out.println("starting the threads");

        for (int i = 0; i < 10; i++) {
            thread = factory.newThread(task);
            thread.start();

            System.out.printf("Factory status:\n");
            System.out.printf("%s\n", factory.getStatus());
        }

    }

}
