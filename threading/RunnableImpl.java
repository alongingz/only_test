package com.learn.threading;

/**
 * 使用同步代码块，解决线程安全问题方式一
 */

public class RunnableImpl implements Runnable{
    private int ticket = 100;
//    private int ticket = 1;

    // 创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票卖完了，关门歇业");
                break;
            }
            // 同步代码块，解决线程安全问题方式一
            synchronized (obj) {
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
    }


}
