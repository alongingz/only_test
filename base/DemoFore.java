package com.learn.base;

public class DemoFore {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nums.length; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        for (int num : nums) {
            if (num < 5) {
                System.out.print(num + ", ");
            }
            else {
                System.out.println(-99);
            }
        }
    }
}
