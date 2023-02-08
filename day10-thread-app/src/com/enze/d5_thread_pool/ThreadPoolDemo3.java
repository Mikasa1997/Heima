package com.enze.d5_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //1.创建固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
    }
}
