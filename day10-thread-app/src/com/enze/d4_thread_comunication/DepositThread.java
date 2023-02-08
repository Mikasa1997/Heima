package com.enze.d4_thread_comunication;

public class DepositThread extends Thread {
    private Account acc;

    public DepositThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            acc.depositMoney(10000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
