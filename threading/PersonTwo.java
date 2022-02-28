package com.learn.threading;

/**
 * 创建 Runnable 接口的实现类，重写 run 方法，
 */

public class PersonTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
