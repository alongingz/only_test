package com.learn.threading;

public class ChiHuo extends Thread {
    // 私有属性 BaoZi 类型
    private BaoZi baozi;

    // 构造方法 参数为 BaoZi 类型
    public ChiHuo(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        synchronized (baozi) {
            // 当前没有包子，线程无限等待
            if (baozi.baoZiStatus == false && baozi.baoZiNums == 0) {
                try {
                    baozi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 有包子了，线程被唤醒，可以继续执行
            System.out.println("吃货" + Thread.currentThread().getName() + "在吃包子,当前有包子数量是：" + baozi.baoZiNums);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            baozi.baoZiNums --;
            // 包子吃完了，修改包子状态，唤醒等待状态的包子铺线程
            if (baozi.baoZiNums == 0) {
                baozi.baoZiStatus = false;
                baozi.notify();
                System.out.println("包子被吃完了，老板开始做包子吧");
            }


        }

    }
}
