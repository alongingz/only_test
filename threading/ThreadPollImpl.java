package com.learn.threading;

public class ThreadPollImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "这个线程执行了");
    }
}
