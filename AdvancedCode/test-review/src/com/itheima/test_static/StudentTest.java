package com.itheima.test_static;

public class StudentTest {
    /*
        static关键字：
            1.被static修饰的成员，会被该类的所有对象所共享
            2.被static修饰的成员，会随着类的加载而加载，优先于对象存在
            3.多了一种调用方式，可以通过"类名."进行调用
     */
    public static void main(String[] args) {
        Student student1 = new Student("张三",23);
        Student student2 = new Student("张蕾",24);
        student2.setClasses("17生科");
        System.out.println(student1.getClasses() + student1.getName() + student1.getAge());
    }
}
