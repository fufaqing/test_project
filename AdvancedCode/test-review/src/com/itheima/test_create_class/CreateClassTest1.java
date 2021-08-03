package com.itheima.test_create_class;

public class CreateClassTest {

    /*
        创建内部类对象的格式:
            外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
     */
    public static void main(String[] args) {

        //调用Inter中的Outer的show();
        Inter.Outer interOuter = new Inter().new Outer();
        interOuter.show();

        Inter inter = new Inter();
        inter.method();
    }
}

class Inter {
    //定义外部类中的私有变量a
    private int a = 10;

    class Outer {
        int b = 15;

        public void show() {
            System.out.println("Outer的show()……" + a);
        }
    }

    //外部类调用内部类中的b,必须通过调用内部类的对象才可以得到
    public void method(){
        Outer outer = new Outer();
        int num = outer.b;
        System.out.println("获取到内部类的" + num);

    }


}