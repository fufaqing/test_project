package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao implements BaseTeacherDao{

    //使用数组
    Teacher[] teachers = new Teacher[5];

    //查看所有老师的方法
    @Override
    public Teacher[] findAllTeacher() {
        return teachers;

    }

    //添加老师的方法
    @Override
    public boolean addTeacher(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher ter = this.teachers[i];
            if (ter == null) {
                index = i;
                break;
            }
        }

        if (index != -1){
            teachers[index] = teacher;
            return true;
        }else {
            return false;
        }

    }

    //删除老师的方法
    @Override
    public void deleteTeacherById(String id) {
        int index = getIndex(id);
        teachers[index] = null;
    }

    //通过id获得索引值
    @Override
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher ter = teachers[i];
            if (ter != null && ter.getId().equals(id)){
                index = i;
            }
        }
        return index;
    }

    //修改老师信息
    @Override
    public void updateTeacherbyId(String id,Teacher teacher) {
        int index = getIndex(id);
        teachers[index] = teacher;

    }
}
