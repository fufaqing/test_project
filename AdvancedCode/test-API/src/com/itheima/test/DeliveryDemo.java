package com.itheima.test;

public class DeliveryDemo {
    /*
        递归概述：以编程的角度来看，递归指的是方法定义中调用方法本身的现象
        做一个小案例：
            求1~100之间的和
     */
    public static void main(String[] args) {
        //累加的测试
        int sum = delivery(100);
        System.out.println("1~100的总和为:" + sum);

        //累乘的测试
        long multiply = multiply(10);
        System.out.println("1~10的累乘为:" + multiply);
    }

    //累加
    public static int delivery(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + delivery(i - 1);
        }
    }

    //累乘
    public static long multiply(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * multiply(num - 1);
        }
    }
}
