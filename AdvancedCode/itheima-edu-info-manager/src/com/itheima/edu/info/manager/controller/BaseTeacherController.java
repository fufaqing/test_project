package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public abstract class BaseTeacherController {
    private Scanner scanner = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    //老师管理系统开始
    public void start() {
        while (true) {
            System.out.println("--------欢迎来到<老师>管理系统");
            System.out.println("请输入您的选择: 1.添加老师 2.删除老师 3.修改老师 4.查看老师 5.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    //System.out.println("1.添加老师");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("2.删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    //System.out.println("3.修改老师");
                    updateTeacherbyId();
                    break;
                case "4":
                    //System.out.println("4.查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("您输入的值有误,请重新输入");
                    break;
            }
        }
    }

    //查看所有老师信息
    private void findAllTeacher() {
        Teacher[] allTeacher = teacherService.findAllTeacher();
        if (allTeacher == null) {
            System.out.println("无数据!");
            //结束方法
            return;
        }
        //else {
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < allTeacher.length; i++) {
            Teacher teacherInfo = allTeacher[i];
            if (teacherInfo == null) {
                break;
            }
            System.out.println(teacherInfo.getId() + "\t" + teacherInfo.getName() + "\t" + teacherInfo.getAge() + "\t" + teacherInfo.getBirthday());
        }


    }

    //修改老师信息
    public void updateTeacherbyId() {
        String id = inputStudentId();
        Teacher teacher = addTeacherInfo(id);
        teacherService.updateTeacherbyId(id, teacher);
        System.out.println("修改成功!");
    }

    //删除老师信息
    public void deleteTeacherById() {
        String id = inputStudentId();
        teacherService.deleteTeacherById(id);
        System.out.println("删除成功!");
    }

    //新增老师信息
    public void addTeacher() {
        //假设存在
        String id;
        while (true) {
            System.out.println("请输入学号:");
            id = scanner.next();
            boolean exists = teacherService.isExists(id);
            //判断学号是否存在
            if (!exists) {
                break;
            } else {
                System.out.println("学号已存在请重新输入:");
            }
        }
        Teacher teacher = addTeacherInfo(id);
        boolean result = teacherService.addTeacher(teacher);
        if (result) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }

    //定义一个能获取输入id的方法
    public String inputStudentId() {
        String id;
        while (true) {
            System.out.println("请输入学号:");
            id = scanner.next();
            boolean exists = teacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("您输入的学号不存在");
            }
        }
        return id;
    }

    //添加除了学号以外的信息
    public abstract Teacher addTeacherInfo(String id);
}
