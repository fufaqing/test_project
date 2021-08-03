package com.itheima.test;

public class StringHandlerTest {
    public static void main(String[] args) {
        //匿名内部类
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(int num) {

            }
        });

        //Lambda表达
        useStringHandler((int num) -> {
                    System.out.println(10);
                }

        );
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage(10);
    }
}

interface StringHandler {
    void printMessage(int num);
}