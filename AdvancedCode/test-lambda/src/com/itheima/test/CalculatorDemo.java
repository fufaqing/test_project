package com.itheima.test;

public class CalculatorDemo {
    public static void main(String[] args) {
        //匿名内部类
        useCalculator(new Calculator() {
            @Override
            public int calc(int num) {
                int a = 10;
                int b = 20;
                int sum = a + b;
                return sum;
            }
        });

        //lambda
        useCalculator((int a) -> {
            a = 10;
            int b = 20;
            int sum = a + b;
            return sum;
        });

    }

    public static void useCalculator(Calculator calculator) {
        int num = calculator.calc(10);
        System.out.println(num);
    }
}

interface Calculator {
    int calc(int num);
}
