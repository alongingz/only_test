package com.learn.threading;

/**
 * 创建多线程方式一：继承 Thread 类，重写 run 方法，创建实例，调用实例的 start 方法开启新线程来调用 run 方法
 */

public class MyThread extends Thread{
    public MyThread() {
    }

    // 带参数的构造方法，参数为线程名，把参数传递给父类，让父类给子线程起名字
    public MyThread(String name) {
        super(name); // 把参数传递给父类，让父类给子线程起名字
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 5; i++) {
//            System.out.println("--------------" + i);
//            System.out.println(getName());  // getName() 获取线程名
            System.out.println(currentThread()); // currentThread() 当前线程

            // sleep 让线程暂停某个毫秒值
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
