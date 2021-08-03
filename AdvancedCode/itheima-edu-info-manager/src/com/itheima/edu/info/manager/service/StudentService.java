package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {

    //创建StudentDao(库管)
    //private OtherStudentDao studentDao = new OtherStudentDao();
    //通过学生工厂类，获取库管对象
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    //判断学号是否存在
    //通过调用studentDao.findAllStudent()判断这个id是否存在
    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        //假设id在数组中不存在
        boolean exists = false;
        //遍历数组，获取每一个学生对象，准备进行判断
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //不为空且id重复
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    //添加学生方法
    public boolean addStudent(Student student) {
        //将学生对象传递给StudentDao库管中的addStudent方法
        //将返回的boolean类型结果，返还给StudentController
        return studentDao.addStudent(student);
    }

    //根据学号删除学生信息
    public void deletStudentById(String delId) {
        studentDao.deletStudentById(delId);
    }

    //根据学号修改学生信息
    public void updateStudentById(String updateId, Student student) {
        studentDao.updateStudentById(updateId, student);
    }

    //查看学生信息
    public Student[] findAllStudent() {

        Student[] allStudent = studentDao.findAllStudent();

        //判断这个数组中是否有学生信息,有一个就是有信息
        boolean exists = false;
        for (int i = 0; i < allStudent.length; i++) {
            if (allStudent[i] != null) {
                exists = true;
                break;
            }
        }
        //返回返回结果
        if (exists) {
            return allStudent;
        } else {
            return null;
        }
    }
}
