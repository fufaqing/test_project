package com.itheima.test;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder("abc");
        //调用的是str.equals(),String类型的equals,先判断数据类型,再看里面的值是否一样
        System.out.println(str.equals(sb));

        //调用的是StringBuilder的equals(),又因为StringBuilder本身没有equals()方法，
        //所以StringBuilder调用的是父类Object的equals(),此时比较的是地址值，故返回false.
        System.out.println(sb.equals(str));

    }
}
