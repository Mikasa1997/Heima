package com.enze.d5_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

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
        Future<String> t1 = pool.submit(new MyCallable(10));
        Future<String> t2 = pool.submit(new MyCallable(100));
        Future<String> t3 = pool.submit(new MyCallable(50));

        System.out.println(t1.get());
        System.out.println(t2.get());
        System.out.println(t3.get());
        //3个核心线程

        //队列

        //临时线程

        //异常

    }
}
