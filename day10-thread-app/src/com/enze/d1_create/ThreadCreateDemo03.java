package com.enze.d1_create;

public class ThreadCreateDemo03 {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("sub thread1 is runnning..." + i);
                }
            }
        };
        new Thread(target).start();

        new Thread(()-> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("sub2 thread1 is runnning..." + i);
                }
            }
        ).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread1 is runnning..." + i);
        }
    }
}
