package com.enze.d6_timer;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo2 {
    public static void main(String[] args) {
        //1.创建ScheduledExecutorService线程池，做定时器
        ScheduledExecutorService timerPool = Executors.newScheduledThreadPool(3);
        System.out.println(Thread.currentThread().getName());
        //2.创建定时器
        timerPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "输出：AAA ---> " + new Date());

            }
        }, 0, 2, TimeUnit.SECONDS);

        timerPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "输出：BBB ---> " + new Date());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);

        timerPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "输出：CCC ---> " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

        timerPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "输出：DDD ---> " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
