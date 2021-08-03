package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        //局部代码块
        {
            int a =0;
            System.out.println(a);
        }

        Animal animal1 = new Animal();
        Animal animal2 = new Animal(10);
    }
}

class Animal{

    static {
        System.out.println("啦啦啦啦啦");
    }

    {
        System.out.println("构造代码块");
    }

    public Animal(){

        System.out.println("无参的构造方法……");

    }

    public Animal(int age){
        System.out.println("带参的构造方法……");
    }
}
