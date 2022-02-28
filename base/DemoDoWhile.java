package com.learn.base;

public class DemoDoWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 10) {
            System.out.println("num now is: " + num);
            num++;
        }

        int a = 2;
        while (a < 0) {
            System.out.println("a now is : " + a);
            a--;
        }
        // do {} while() 至少执行一次
        int b = 0;
        do {
            System.out.println("b now is :" + b);
            b--;
        } while (b >= 0);

    }
}
