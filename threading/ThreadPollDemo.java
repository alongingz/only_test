package com.learn.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo {
    public static void main(String[] args) {
        // 生产一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 调用 submit 方法，传递线程任务（Runnable接口的实现类），开启线程，执行run方法
        executorService.submit(new ThreadPollImpl());
        executorService.submit(new ThreadPollImpl());
        executorService.submit(new ThreadPollImpl());
        executorService.submit(new ThreadPollImpl());

        // 销毁线程池
        executorService.shutdown();
    }
}
