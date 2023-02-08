package com.enze.d4_thread_comunication;

public class ThreadDemo {
    public static void main(String[] args) {
        Account acc = new Account("1314", 0);

        new DepositThread("岳父", acc).start();
        new DepositThread("亲爹", acc).start();
        new DepositThread("干爹", acc).start();

        new DrawThread("小胡", acc).start();
        new DrawThread("小高", acc).start();
    }
}
