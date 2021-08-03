package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public interface BaseTeacherDao {

    //查看所有老师
    public Teacher[] findAllTeacher();

    //添加老师
    public boolean addTeacher(Teacher teacher);

    //删除老师
    public void deleteTeacherById(String id);

    //获得索引值
    public int getIndex(String id);

    //修改老师信息
    public void updateTeacherbyId(String id, Teacher teacher);
}
