package com.itheima.test_static;

public class Test1Polymorpic {
    /*
           多态的前提：
               1.要有（继承/实现）对象
               2.要有方法重写
               3.要有父类引用，指向子类对象
     */
    public static void main(String[] args) {
        //当前对象是一只动物
        Animal cat= new Cat();
        cat.eat();
        //当前对象是一只猫
        //Cat cat = new Cat();

    }


}

class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
