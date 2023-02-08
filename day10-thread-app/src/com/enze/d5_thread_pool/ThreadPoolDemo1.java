package com.enze.d5_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {

        /*
              public ThreadPoolExecutor(int corePoolSize,
                                        int maximumPoolSize,
                                        long keepAliveTime,
                                        TimeUnit unit,
                                        BlockingQueue<Runnable> workQueue,
                                        ThreadFactory threadFactory,
                                        RejectedExecutionHandler handler)
         */

        //1.创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        //2.给任务给线程池
        Runnable target = new MyRunnable();

        //3个核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //队列
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //临时线程
        pool.execute(target);
        pool.execute(target);
        //异常

        pool.shutdown();
    }
}
