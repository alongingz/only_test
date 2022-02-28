package com.learn.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TreadingLockImpl implements Runnable{
    private int ticket = 100;
    // 创建 ReentrantLock 锁对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票卖完了，关门歇业");
                break;
            }

            // 加锁
            lock.lock();

            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第 " + ticket + " 张票");
                    ticket --;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 解锁
                    lock.unlock();
                }

            }
        }


    }
}
