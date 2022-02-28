package com.learn.base;

public class DemoFive {
    public static void main(String[] args) {
        String month = "f";
        int result = getMonthNumber(month);
        System.out.println(result);
    }

    public static int getMonthNumber(String month) {
        int monthNumber = 0;
        if (month == null) {
            return monthNumber;
        }
        switch (month.toLowerCase()) {
            case "j":
                monthNumber = 1;
                break;
            case "f":
                monthNumber = 2;
                break;
            default:
                break;
        }
        return monthNumber;
    }


}
