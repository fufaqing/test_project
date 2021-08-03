package com.itheima.test_abstract;

public class AbstractTest {
    /*
        注意事项：
            1.抽象类不能创建对象，只能通过实现类来创建对象，因为抽象类中的抽象方法没有具体逻辑
            2.抽象类中有构造方法
            3.抽象类的子类：
                A:必须重写父类的抽象方法
                B:可以把自己也变成抽象类
            4.抽象类中的方法：
                抽象类中可以没有抽象方法，但是抽象方法一定存在于抽象类中
     */
    public static void main(String[] args) {

        Zi zi = new Zi();
        zi.eat();
        zi.eat(3);
        zi.sleep();
        zi.drink();

    }
}

abstract class Fu{
    public abstract void eat();
    public abstract void eat(int a);
    public abstract void sleep();
    public abstract void drink();
}

class Zi extends Fu{
    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }

    @Override
    public void eat(int a) {
        System.out.println("吃了" + a + "斤");
    }

    @Override
    public void sleep() {
        System.out.println("睡睡睡");
    }

    @Override
    public void drink() {
        System.out.println("喝喝喝");
    }
}