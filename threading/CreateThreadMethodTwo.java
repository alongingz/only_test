package com.learn.threading;

/**
 * 创建线程的方式二：创建 Runnable 接口的实现类，重写 run 方法，创建 Thread 类的实例对象，将 Tunnable 接口的实现类对象作为参数传递，调用实例的 start 方法开启新线程来调用 run 方法
 * 好处：1、避免单继承的局限性；2、增强扩展，解耦
 */

public class CreateThreadMethodTwo {
    public static void main(String[] args) {
        PersonTwo p2 = new PersonTwo();
        Thread t1 = new Thread(p2);
        t1.start();
    }
}
