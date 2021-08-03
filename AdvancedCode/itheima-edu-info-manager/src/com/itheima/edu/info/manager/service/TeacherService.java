package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.BaseTeacherDao;
import com.itheima.edu.info.manager.dao.OtherTeacherDao;
import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.factory.TeacherDaoFactory;

public class TeacherService {

    //创建OtherTeacherDao的对象
    //private OtherTeacherDao teacherDao = new OtherTeacherDao();
    //通过老师工厂类，获取库管对象
    private BaseTeacherDao teacherDao = TeacherDaoFactory.getTeacherDao();

    //判断这个值是否已经存在
    public boolean isExists(String id) {
        Teacher[] allTeacher = teacherDao.findAllTeacher();
        boolean exists = false;
        for (int i = 0; i < allTeacher.length; i++) {
            Teacher ter = allTeacher[i];
            if (ter != null && ter.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;

    }

    //通过teacherDao添加老师信息
    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    //通过teacherDao删除老师信息
    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }

    //通过teacherDao修改老师信息
    public void updateTeacherbyId(String id,Teacher teacher) {
        teacherDao.updateTeacherbyId(id,teacher);
    }

    //查看所有老师信息
    public Teacher[] findAllTeacher() {
        Teacher[] allTeacher = teacherDao.findAllTeacher();
        //判断是否有学生信息
        boolean exists = false;
        for (int i = 0; i < allTeacher.length; i++) {
            if (allTeacher[i] != null){
                exists = true;
                break;
            }
        }
        if (exists){
            return allTeacher;
        }else {
            return null;
        }
    }
}
