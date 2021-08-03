package com.itheima.test;

public class IntegerDemo {
    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("100");
        System.out.println(i1);
        System.out.println(i2);

        //装箱:把一个基本数据类型 --> 变量对应的包装类
        //自动:Java底层会帮我们自动的调用valueOf方法
        Integer i3 = 100;
        System.out.println(i3);

        //拆箱:
        i3 += 200;
        System.out.println(i3);
        //i3 = i3 + 200;
        //会把i3这个对象变成基本数据类型100
        //100+200=300;
        //基本数据类型300再次自动装箱变成integer对象赋值给i3

        String num1 = "100";
        int num2 = 200;
        int result = Integer.parseInt(num1) + num2;
        System.out.println(result);
    }
}
