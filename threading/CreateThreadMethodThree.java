package com.learn.threading;

/**
 * 使用匿名内部类的方式创建线程
 *
 */

public class CreateThreadMethodThree {
    public static void main(String[] args) {
        //
        new Thread() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类" + currentThread().getName());
            }
        }.start();


        // Tunnable 接口的匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 的匿名内部类" + Thread.currentThread().getName());
            }
        }).start();

    }
}
