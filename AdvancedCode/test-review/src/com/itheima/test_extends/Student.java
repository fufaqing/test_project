package com.itheima.test_extends;

public class Student extends Person{

    @Override
    public void eat() {
        System.out.println("不吃");
    }

//    @Override
    //静态方法不能被重写，
    //如果子类中也存在一个和父类一模一样的方法，
    // 可以理解为子类将父类中的这个方法隐藏了起来，并非是方法重写
    public static void say(){
        System.out.println("say hello!");
    }

    public Student(){
        System.out.println("子类中的无参构造……");
    }
    public Student(int a){
        System.out.println("子类中的有参构造……");
    }
}
