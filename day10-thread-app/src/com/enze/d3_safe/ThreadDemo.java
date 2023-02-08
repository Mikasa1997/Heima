package com.enze.d3_safe;

public class ThreadDemo {
    public static void main(String[] args) {
        Account acc = new Account("1024", 100000);

        new MyThread(acc,"小胡").start();
        new MyThread(acc,"小高").start();
    }
}
