package com.enze.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreateDemo04 {
    public static void main(String[] args) {
        Callable<String> callable = new MyCallable(5);
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread t = new Thread(futureTask);

        Callable<String> callable2 = new MyCallable(100);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);
        Thread t2 = new Thread(futureTask2);

        t.start();
        t2.start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(futureTask2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "求和的结果是:" + sum;
    }
}