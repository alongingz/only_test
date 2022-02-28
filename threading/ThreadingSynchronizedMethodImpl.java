package com.learn.threading;

/**
 * 使用同步方法 使用 synchronized ，解决线程安全问题 方式二
 */

public class ThreadingSynchronizedMethodImpl implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票卖完了，关门歇业");
                break;
            }
            // 同步方法，解决线程安全问题 方式二调用
            buyTicket();
        }
    }


    // 同步方法 使用 synchronized ，解决线程安全问题 方式二
    public synchronized void buyTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第 " + ticket + " 张票");
            ticket --;
        }
    }
}
