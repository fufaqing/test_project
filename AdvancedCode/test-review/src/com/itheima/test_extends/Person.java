package com.itheima.test_extends;

public class Person {
    private String name;
    private int age;

    public static void say(){
        System.out.println("say hello!");
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public Person(){
        System.out.println("父类中的无参构造……");
    }
}
