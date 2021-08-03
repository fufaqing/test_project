package com.itheima.test;

public interface InterB {
    public default void show(){
        System.out.println("这是接口B定义的show方法……");
    }
}
