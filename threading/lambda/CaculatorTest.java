package com.learn.threading.lambda;

/**
 * 计算两个数的和 实现 Caculator 接口的 cal 方法
 */

public class CaculatorTest {
    public static void main(String[] args) {
        // 使用匿名内部类方式
        invokeCaculator(10, 20, new Caculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });

        // 使用 Lambda 方式
        invokeCaculator(1, 2, (a, b)->{
            return a + b;
        });
    }

    // Caculator 接口为参数 方法封装
    public static void invokeCaculator(int a, int b, Caculator caculator) {
        int result = caculator.cal(a, b);
        System.out.println("计算结果是：" + result);
    }
}
