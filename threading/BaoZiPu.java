package com.learn.threading;

public class BaoZiPu extends Thread{
    // 私有属性 BaoZi 类型
    private BaoZi baozi;
    int count = 0;

    // 构造方法 参数为 BaoZi 类型
    public BaoZiPu(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {

        synchronized (baozi) {
            // 包子还要，不需要包子铺执行，线程无限等待即可
            if (baozi.baoZiStatus == true && baozi.baoZiNums != 0) {
                try {
                    baozi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 没包子了，线程被唤醒，包子铺开始做包子
            System.out.println("包子没了，老板开始做包子》》》》》》");

            if (count % 2 == 0) {
                baozi.baoZiPi = "薄皮";
                baozi.baoZiXian = "猪肉大葱";
            } else {
                baozi.baoZiPi = "厚皮";
                baozi.baoZiXian = "牛肉";
            }

            baozi.baoZiNums += 10;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 修改包子状态 唤醒线程
            baozi.baoZiStatus = true;
            baozi.notify();
            count++;
            System.out.println("包子铺老板 把包子做好了，可以吃了" + baozi.baoZiPi + baozi.baoZiXian + "老板一共做了包子数量是：" + baozi.baoZiNums);
        }
    }
}
