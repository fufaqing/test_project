package com.itheima.test_final;

public class FinalTest {
    /*
        final关键字是最终的意思，可以修饰（方法，变量，类）
        特点：
            修饰方法：表明该方法是最终方法，不能被重写
            修饰变量：表明该变量是常量，不能被再次赋值
            修饰类：表明该类是最终类，不能被重写

     */
    public static void main(String[] args) {
        B b = new B();
        b.sleep();
    }
}

class A {
    final int NUM = 10;
    public final void eat(){
        System.out.println("吃吃吃");
    }
}
//无法继承A类
//class B extends A
class B extends A{

    public void sleep(){
        System.out.println("睡了" + NUM + "小时");
    }

}
