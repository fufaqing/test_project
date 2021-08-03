package com.itheima.test_create_class;

public class CreateClassTest3 {
    /*
        匿名对象类：(特殊的局部内部类)：
            前提：需要继承类或者实现接口
            格式： new 类名 / 接口名({
                重写方法
            })
     */
    public static void main(String[] args) {

        new A() {
            @Override
            public void show() {
                System.out.println("重写接口A的show方法……");
            }
        }.show();

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们去游泳吧!");
            }
        });

        goSwimming(() -> System.out.println("我们去游泳吧!"));

    }

    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}

interface A {
    void show();
}

interface Swimming{
    void swim();
}

