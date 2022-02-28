package com.learn.threading;

/**
 * 使用静态同步方法 ，解决线程安全问题 方式二 扩展
 * 静态方法的锁对象时本类的 class 属性 --> class 文件对象
 *
 */

public class ThreadingSynchronizedStaticMethodImpl implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票卖完了，关门歇业");
                break;
            }
            bugTicket();
        }
    }

    public static synchronized void bugTicket() {
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
