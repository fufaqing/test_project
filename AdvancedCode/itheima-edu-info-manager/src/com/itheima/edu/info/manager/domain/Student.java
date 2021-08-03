package com.itheima.edu.info.manager.domain;

/*
    封装学生信息
 */


public class Student extends Person{

    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        super(id, name, age, birthday);
    }
}
