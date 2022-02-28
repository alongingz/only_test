package com.learn.threading;

/**
 * 线程的 等待 和 唤醒
 * wait 和 notify 方法必须要由同一个锁对象调用
 * wait 和 notify 方法必须在同步代码块或者同步函数中使用。因为必须通过同一个锁对象调用这两个方法
 */

public class ThreadingWaitNotify {
    public static void main(String[] args) {
        // 创建锁对象
        Object obj = new Object();

        // 创建一个消费者线程
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客1 告知老板要的包子种类和数量");
                    try {
                        // 无线等待，wait 方法不传参数，WAITING 状态，直到被唤醒后继续执行后续代码
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 唤醒之后
                    System.out.println("顾客1 被唤醒了，包子真好吃");
                }
            }
        }.start();

        // 创建一个消费者线程
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客2 告知老板要的包子种类和数量");
                    try {
                        // 无线等待，wait 方法不传参数，WAITING 状态，直到被唤醒后继续执行后续代码
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 唤醒之后
                    System.out.println("顾客2 被唤醒了，包子真好吃");
                }
            }
        }.start();

        // 创建一个生产者线程
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("老板5秒后做好了包子，要唤醒顾客吃包子");

                    // 随机唤醒一个等待的线程
//                    obj.notify();
                    // 唤醒所有等待的线程
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
