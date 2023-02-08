package com.enze.d1_create;

public class ThreadCreateDemo01 {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出！！！" + i);
        }
    }
}

/**
 * 1.定义一个线程类，并集成Thread类
 */
class MyThread extends Thread {
    /**
     * 2.重写run()方法，里面是定义线程以后要干什么
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出！！！" + i);
        }
    }
}