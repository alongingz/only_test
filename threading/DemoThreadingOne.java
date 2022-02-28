package com.learn.threading;

/**
 * 创建多线程方式一：继承 Thread 类，重写 run 方法，创建实例，调用实例的 start 方法开启新线程来调用 run 方法
 */

public class DemoThreadingOne {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.run();

        // 主线程名称  main
//        System.out.println(Thread.currentThread().getName());;

        // 创建实例，调用实例的 start 方法开启新线程来调用 run 方法
        MyThread myThread1 = new MyThread();
        myThread1.setName("娃哈哈");  // 设置线程名称
        myThread1.start();

        MyThread myThread2 = new MyThread("洛丽塔");
        myThread2.start();



    }
}
