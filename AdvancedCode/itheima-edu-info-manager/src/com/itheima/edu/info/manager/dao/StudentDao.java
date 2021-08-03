package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao implements BaseStudentDao{

    //使用数组
    static Student[] students = new Student[5];

    //添加学生方法
    @Override
    public boolean addStudent(Student student) {

        //添加学生到数组
        //定义变量为index为-1，假设数组全部都已经存满，没有null的元素
        int index = -1;

        //遍历数组，取出每一个元素，判断是否是null
        for (int i = 0; i < students.length; i++) {
            Student stus = this.students[i];
            if (stus == null) {
                index = i;
                //如果为null,说明数组中还有位置存储数据，并使用break结束循环遍历
                break;
            }
        }

        //返回是否添加成功的boolean类型状态
        if (index == -1) {
            //装满了
            return false;
        } else {
            //没有装满，正常添加，返回true
            students[index] = student;
            return true;
        }

    }

    //查看学生方法
    @Override
    public Student[] findAllStudent() {
        //定义的学生对象为5个的学生数组
        return students;
    }

    //删除学生方法
    @Override
    public void deletStudentById(String delId) {
        //找到学号对应的索引号
        int index = getIndex(delId);
        //使用该索引位置对其进行覆盖
        students[index] = null;
    }

    //修改学生信息
    @Override
    public void updateStudentById(String updateId, Student student) {
        //找到要修改的学号的索引值
        int index = getIndex(updateId);
        //将传入的学生对象赋值给stus[index]
        students[index] = student;

    }

    //返回与学号对应的索引值
    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }
}
