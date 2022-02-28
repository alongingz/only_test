package com.learn.base;


public class DemoSwithCaseIfFor {
    public static void main(String[] args) {
        java.util.ArrayList<String> months = new java.util.ArrayList<String>();
        int a = 0;
        switch (a) {
            case 0:
                months.add("January");
            case 1:
                months.add("February");
                break;
            default:
                break;
        }
        if (months.isEmpty()) {
            System.out.println("null");
        } else {
            for (String month : months) {
                System.out.println(month);
            }
        }
    }
}
