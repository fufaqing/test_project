package com.itheima.test_code_block;

public class CodeBlockTest {
    /*
            局部代码块：
                位置：定义在方法中
                作用：限定变量的生命周期，及早释放，提高内存的使用率

            构造代码块：
                位置：类中方法外定义
                特点：每次构造方法执行时，都会先执行构造代码块中的代码，
                    并且在构造方法执行前执行
                作用：将多个构造方法中的代码提取到构造代码块中，提高代码的复用性

            静态代码块：
                位置：类中方法外定义，
                特点：需要通过static关键字修饰，随着类的加载而加载，只执行一次
                作用：在类的加载的时候做一些初始化的操作

         */
    public static void main(String[] args) {
        Student student = new Student();


    }
}

class Student{
    {
        System.out.println("这是构造代码块");
    }
    public Student(){
        System.out.println("无参构造……");
        {
            System.out.println("这是局部代码块");
        }
    }
    static {
        System.out.println("这是静态代码块");
    }

}