package com.itheima.test;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张三",23,100);
        System.out.println(student.getName()+"……"+student.getAge()+"……"+student.getScore());
    }
}
