package com.enze.d1_create;

public class ThreadCreateDemo02 {
    public static void main(String[] args) {
        /**
         *      3.创建一个任务对象
         */
        Runnable target = new MyRunnable();
        new Thread(target).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出！！！" + i);
        }
    }
}

/**
 *      1.定义一个线程任务类，实现runnable接口
 */
class MyRunnable implements Runnable{
    /**
     *      2.重写run方法，定义线程的任务
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出！！！" + i);
        }
    }
}