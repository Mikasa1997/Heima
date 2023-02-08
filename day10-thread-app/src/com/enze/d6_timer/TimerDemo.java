package com.enze.d6_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了 HelloWorld---> + " + new Date());
            }
        }, 2000,2000);
    }
}
