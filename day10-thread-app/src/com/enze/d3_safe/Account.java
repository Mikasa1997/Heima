package com.enze.d3_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;

    private final Lock lock = new ReentrantLock();
    public String getCardId() {
        return cardId;
    }

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardId='" + cardId + '\'' +
                ", money=" + money +
                '}';
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            if (this.money >= money) {
                System.out.println("当前余额" + this.money);
                System.out.println(name + "成功取走了" + money + "元");
                this.money -= money;
            } else {
                System.out.println("余额不足！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
