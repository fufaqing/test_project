package com.itheima.test;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        inter.method();
        inter.show();
    }
}

class InterImpl implements Inter,InterA,InterB{
    public void method(){
        System.out.println(NUM);
    }


    @Override
    public void show() {
        System.out.println("这是改写后的show方法……");
    }
}
