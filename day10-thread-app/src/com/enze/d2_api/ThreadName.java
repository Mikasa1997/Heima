package com.enze.d2_api;

public class ThreadName {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("1号");
        MyThread t2 = new MyThread("2号");
        MyThread t3 = new MyThread("3号");

        t1.start();
        t2.start();
        t3.start();

        Thread m = Thread.currentThread();
        Thread.sleep(3000);
        for (int i = 0; i < 5; i++) {
            System.out.println(m.getName() + "线程正在运行：" + i);
        }
    }
}
