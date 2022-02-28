package com.learn.threading.lambda;


/**
 * Lambda 表达式
 * 格式： (参数1, 参数2)->{方法体}
 */


public class DemoLambda {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("使用 Runnable 接口的对象作为线程任务");
            }
        };
        Thread t = new Thread(r);
        t.start();


        // 使用匿名内部类的方式 创建线程执行线程任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类的方式 创建线程执行线程任务");
            }
        }).start();


        // 使用 lambda 表达式 创建线程执行线程任务
        new Thread(() -> {
            System.out.println("使用 lambda 表达式 创建线程任务");
        }).start();
    }
}
