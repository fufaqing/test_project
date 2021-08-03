package com.itheima.test;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        //匿名内部类
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random random = new Random();
                int ran = random.nextInt(15) + 1;
                return ran;
            }
        });

        //Lambda实现
        useRandomNumHandler(() -> {
            //要有返回值
                    Random random = new Random();
                    int ran = random.nextInt(15) + 1;
                    return ran;
                }
        );
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int ran = randomNumHandler.getNumber();
        System.out.println(ran);
    }
}

interface RandomNumHandler {
    int getNumber();
}
