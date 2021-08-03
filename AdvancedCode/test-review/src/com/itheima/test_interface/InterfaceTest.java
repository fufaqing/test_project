package com.itheima.test_interface;

public class InterfaceTest {
    /*
        接口介绍：
            当一个类中所有的方法都是抽象方法的时候，可以将其定义为接口
            接口是一种引用数据类型，他比抽象类还要抽象
        接口存在的两个意义：
            1.规则的定义
            2.程序的拓展性

        接口的定义和特点：
            接口和类的关系可以是单实现，也可以是多实现
        接口中的成员特点：
            成员变量：只能是常量，数据类型前面会默认加上(public final static),
            构造方法：没有
            成员方法：只能是抽象方法，系统会默认加上(public abstract)

        JDK8以后：
            允许在接口中定义非抽象方法，但是要用default关键字修饰，这个叫做默认方法
            作用：解决接口升级的问题

            默认方法不是抽象方法，所以不强制被重写，如果要重写，就要去掉default关键字，
            如果想在接口中调用default方法，要么重写，要么通过实现类的对象调用

            如果实现类实现了多个接口，且其中存在有相同的方法，子类必须对其重写，谁的都不用，用自己的

            接口中如果定义了静态方法，则只能通过接口名.调用，不能通过实现类名或者对象名调用
     */

    public static void main(String[] args) {
        B b = new B();
        b.eat();
        b.sleep();
        b.drink();
        b.song();
    }
}

interface InterA{
    public final static int NUM = 0;
    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();
    public default void song(){
        System.out.println("接口A唱歌！");
    };
    public static void read(){};
}

interface InterB{

    public abstract void eat();


    public default void song(){
        System.out.println("接口B唱歌！");
    };
}

class B implements InterA,InterB{
    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡睡睡");
    }

    @Override
    public void drink() {
        System.out.println("喝喝喝");
    }

    @Override
    public void song() {
        System.out.println("儿子唱歌");
    }


}
