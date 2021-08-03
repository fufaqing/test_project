package com.itheima.edu.info.manager.controller;

/*
    和客户打交道，客服接待
*/

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{

    private Scanner scanner = new Scanner(System.in);

    //键盘录入学生信息
    @Override //注解判断
    public Student inputStudentInfo(String id) {
        //键盘录入学生信息
        System.out.println("请输入学生姓名:");
        String name = scanner.next();
        System.out.println("请输入学生年龄:");
        String age = scanner.next();
        System.out.println("请输入学生生日:");
        String birthday = scanner.next();
        //将学生信息的值赋值到学生对象当中
        Student student = new Student(id,name,age,birthday);

        //返回学生对象
        return student;
    }
}
