package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

import java.util.ArrayList;

public class OtherTeacherDao implements BaseTeacherDao{

   //使用集合
    ArrayList<Teacher> teachers = new ArrayList<>();

    //添加老师信息
    @Override
    public boolean addTeacher(Teacher teacher) {
        teachers.add(teacher);
        return true;

    }

    //删除老师信息
    @Override
    public void deleteTeacherById(String id) {
        int index = getIndex(id);
        teachers.remove(index);
    }

    //修改学生信息
    @Override
    public void updateTeacherbyId(String id,Teacher teacher) {
        int index = getIndex(id);
        teachers.set(index,teacher);
    }

    //查看所有老师，不改变数据类型
    @Override
    public Teacher[] findAllTeacher() {
        Teacher[] teacher = new Teacher[teachers.size()];
        for (int i = 0; i < teachers.size(); i++) {
            teacher[i] = teachers.get(i);
        }
        return teacher;
    }

    //通过id获得索引值
    @Override
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teachers.size(); i++) {
            Teacher ter = teachers.get(i);
            if (ter != null && ter.getId().equals(id)){
                index = i;
            }
        }
        return index;
    }
}
