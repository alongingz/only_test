package com.learn.base;

public class DemoSwithCase {
    public static void main(String[] args) {
        int a = 10;
        String b = "this is result.";
        switch (a) {
            case 0:
                b = "o";
                break;
            case 10:
                b = "10";
                break;
            case 11:
                b = "11";
                break;
            default:
                b = b;
                break;
        }
        System.out.println(b);

    }
}
