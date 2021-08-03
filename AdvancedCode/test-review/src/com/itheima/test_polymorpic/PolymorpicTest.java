package com.itheima.test_polymorpic;

public class PolymorpicTest {
    /*
        要有类的继承或者接口的实现
        要有方法的重写

        多态的转型：
            1.上转型对象：
                父类引用指向子类对象
            2.下转型对象：
                从父类类型转换为子类类型(强转那味)
     */
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

    }
}

class Animal{
    public void eat(){
        System.out.println("吃吃吃");
    }

    public void sleep(){
        System.out.println("睡睡睡");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫猫吃吃吃");
    }

    @Override
    public void sleep() {
        System.out.println("猫猫睡睡睡");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗狗吃吃吃");
    }

    @Override
    public void sleep() {
        System.out.println("狗狗睡睡睡");
    }
}

