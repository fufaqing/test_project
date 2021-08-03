package com.itheima.test;

public interface InterA {
    //用default
    public default void show(){
        System.out.println("这是接口A中定义的show方法……");
    }

}
