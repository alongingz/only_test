package com.learn.threading.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 用一个数组存储 person 对象，根据年龄排序
 */

public class DemoLambdaPersonTest {
    public static void main(String[] args) {
        LambdaPerson[] lambdaPerson = {
                new LambdaPerson("狗蛋", 10),
                new LambdaPerson("狗剩", 46),
                new LambdaPerson("狗熊", 23),
        };

        // 使用匿名内部类排序
        Arrays.sort(lambdaPerson, new Comparator<LambdaPerson>() {
            @Override
            public int compare(LambdaPerson o1, LambdaPerson o2) {
                return o1.getAge() - o2.getAge(); // 正序
            }
        });

        for (LambdaPerson person : lambdaPerson) {
            System.out.println(person);
        }

        System.out.println("---------------------");

        // 使用 lambda 表达式排序
        Arrays.sort(lambdaPerson, (LambdaPerson o1, LambdaPerson o2)->{
            return o2.getAge() - o1.getAge(); // 倒序
        });
        for (LambdaPerson person : lambdaPerson) {
            System.out.println(person);
        }
    }
}
