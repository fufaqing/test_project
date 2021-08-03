package com.itheima.test;

public class MathDemo {
    /*
        Math类
     */
    public static void main(String[] args) {
//        static double abs(double a)返回 double 值的绝对值。
        int abs = Math.abs(-10);
        System.out.println(abs);

//        static int max(int a, int b)返回两个 int 值中较大的一个。
        int max = Math.max(10, 20);
        System.out.println(max);

//        static int min(int a, int b)返回两个 int 值中较小的一个。
        int min = Math.min(10, 20);
        System.out.println(min);

        System.out.println("--------------");
//        static double random()返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.println(random);
        }

        //向上取整
        double ceil = Math.ceil(10.2);
        System.out.println("向上取整:" + ceil);

        //向下取整
        double floor = Math.floor(10.5);
        System.out.println("向下取整:" + floor);
    }
}
