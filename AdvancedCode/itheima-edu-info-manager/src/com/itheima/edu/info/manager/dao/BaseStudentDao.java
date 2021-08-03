package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public  interface BaseStudentDao {

    //添加学生方法
    public abstract boolean addStudent(Student student) ;

    //查看学生方法,不改变数据类型的情况下修改代码,否则StudentService也得改
    public abstract Student[] findAllStudent() ;

    //删除学生方法
    public abstract void deletStudentById(String delId) ;

    //修改学生信息
    public abstract void updateStudentById(String updateId, Student student) ;

    //返回与学号对应的索引值
    public abstract int getIndex(String id) ;
}
