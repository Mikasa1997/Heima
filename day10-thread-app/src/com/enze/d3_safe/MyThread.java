package com.enze.d3_safe;

/**
 * 取钱的线程类
 */
public class MyThread extends Thread {
    private Account acc;

    public MyThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }


    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
