package com.itheima.edu.info.manager.controller;

/*
    和客户打交道，客服接待
*/

import com.itheima.edu.info.manager.domain.Student;


import java.util.Scanner;

public class StudentController extends BaseStudentController{

    private Scanner scanner = new Scanner(System.in);

    //键盘录入学生信息
    //开闭原则:对拓展内容开放，对修改内容关闭
    //举例好处：如果客户要用两套代码，就不用一直修改，只要操作入口的对象就可以了
    //尽量不在原有的基础上修改代码以完成需求
    @Override
    public Student inputStudentInfo(String id) {
        //键盘录入学生信息
        System.out.println("请输入学生姓名:");
        String name = scanner.next();
        System.out.println("请输入学生年龄:");
        String age = scanner.next();
        System.out.println("请输入学生生日:");
        String birthday = scanner.next();
        //将学生信息的值赋值到学生对象当中
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);

        //返回学生对象
        return student;
    }
}
