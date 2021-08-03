package com.itheima.test3;

public class Test1 {
    public static void main(String[] args) {
        //被final修饰的基本数据类型变量，只能被赋值一次，且其变量名要大写
        final int a = 10;

        //被final修饰的引用数据类型变量，只能被赋值一次，其地址值不能被修改。
        final int[] arr = new int[5];
        //arr = new int[6];

    }
}
/*

final class A{

}

//Cannot inherit from final 'com.itheima.test3.A'
//A被final关键字修饰，不能被继承
class B extends A{

}
*/
