package com.learn.threading;

public class BaoZiTest {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi();

        while (true) {
            new BaoZiPu(baozi).start();
            new ChiHuo(baozi).start();
            new ChiHuo(baozi).start();
            new ChiHuo(baozi).start();
        }
    }
}
