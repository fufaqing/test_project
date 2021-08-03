package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController extends BaseTeacherController{

    private Scanner scanner = new Scanner(System.in);
    @Override
    public Teacher addTeacherInfo(String id) {
        //老师姓名
        System.out.println("姓名:");
        String name = scanner.next();
        //老师年龄
        System.out.println("年龄");
        String age = scanner.next();
        //生日
        System.out.println("生日");
        String birthday = scanner.next();

        Teacher teacher = new Teacher(id,name,age,birthday);

        return teacher;
    }
}
