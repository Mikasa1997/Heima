package com.enze.d4_thread_comunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;

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

    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        try {
            if (this.money >= money) {
                System.out.println(name + "成功取走了" + money + "元");
                this.money -= money;
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void depositMoney(double money) {
        String name = Thread.currentThread().getName();

        try {
            if (this.money >= money) {
                this.notifyAll();
                this.wait();
            } else {
                this.money += money;
                System.out.println(name + "存入了" + money + "元");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
