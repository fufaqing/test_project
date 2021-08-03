package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{

    //使用集合
    private static ArrayList<Student> students = new ArrayList<>();

    //添加学生方法
    @Override
    public boolean addStudent(Student student) {
        //直接调用集合的add()进行添加;
        students.add(student);
        return true;
    }

    //查看学生方法,不改变数据类型的情况下修改代码,否则StudentService也得改
    @Override
    public Student[] findAllStudent() {
        Student[] stus = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            stus[i] = students.get(i);
        }
        return stus;
    }

    //删除学生方法
    @Override
    public void deletStudentById(String delId) {
        //找到学号对应的索引号
        int index = getIndex(delId);
        //直接调用集合的remove()方法进行删除
        students.remove(index);
    }

    //修改学生信息
    @Override
    public void updateStudentById(String updateId, Student student) {
        //找到要修改的学号的索引值
        int index = getIndex(updateId);
        //直接调用集合的set(),对某个index进行修改
        students.set(index,student);

    }

    //返回与学号对应的索引值
    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student != null && student.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }
}
