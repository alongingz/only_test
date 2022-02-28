package com.learn.threading;

public class RunnableImplTest {
    public static void main(String[] args) {
//        RunnableImpl runnable = new RunnableImpl(); // 使用线程锁
//        ThreadingSynchronizedMethodImpl runnable = new ThreadingSynchronizedMethodImpl(); // 使用同步代方法
//        ThreadingSynchronizedStaticMethodImpl runnable = new ThreadingSynchronizedStaticMethodImpl(); // 使用静态方法
        TreadingLockImpl runnable = new TreadingLockImpl(); // 使用 Lock 对象 加解锁
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();

    }
}
