package com.learn.threading.lambda;

public class DemoLambdaNoArgsNoReturn {
    public static void main(String[] args) {
        // 使用 lambda 表达式 重写接口的抽象方法，推荐使用这种方式，简单
        invokeCook(() -> {
            System.out.println("使用 lambda 表达式 重写接口的抽象方法");
        });

        // 使用匿名内部类 重写 接口的抽象方法
        invokeCook(new Cook() {
            @Override
            public void cook() {
                System.out.println("使用匿名内部类 重写 接口的抽象方法");
            }
        });

    }

    // 定义一个方法 使用接口为参数并调用接口的抽象方法
    public static void invokeCook(Cook cook) {
        cook.cook();
    }
}
