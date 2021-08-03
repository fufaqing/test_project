package com.itheima.edu.info.manager.controller;

/*
    和客户打交道，客服接待
*/

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {

    //创建业务员对象
    private StudentService studentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    //开启学生管理系统
    public final void start() {
        do {
            System.out.println("--------欢迎来到<学生>管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    //添加学生方法
                    addStudent();
                    break;
                case "2":
                    //删除学生方法
                    deletStudentById();
                    break;
                case "3":
                    //修改学生方法
                    updateStudentById();
                    break;
                case "4":
                    //查看学生方法
                    findAllStudent();
                    break;
                case "5":
                    //退出学生管理系统操作，
                    System.out.println("感谢您的使用!");
                    return;
                default:
                    System.out.println("您输入的值有误,请重新输入");
                    break;
            }
        } while (true);
    }

    //查看所有学生的方法
    public final void findAllStudent() {
        //调用业务员的findAllStudent()
        Student[] allStudent = studentService.findAllStudent();
        //若无数据，跳出方法继续循环，
        //不能选用allStudent.length == 0，因为在库管那里定义了五个长度
        if (allStudent == null) {
            System.out.println("查无信息,请添加后重试");
            return;
        } //此处不能使用else了，if……else指非a即b,a不成立时b中的sout会打印出来
        // else {
        System.out.println("学号\t姓名\t年龄\t生日");
        //遍历allStudent中数组的地址值和0判断
        for (int i = 0; i < allStudent.length; i++) {
            Student student = allStudent[i];
            //此处要加判断，否则会报空指针异常的错误，因为他会遍历allStudent.length次，
            //若student地址值为null的，它也会运行一遍，所以这里不加判断的话会出现空指针异常
            if (student != null) {
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBirthday());
            }
        }

    }

    //修改学生信息
    public final void updateStudentById() {
        //先判断这个id能否查到
        String updateId = inputStudentId();
        //将要修改的学生的信息存到这个学生对象中去
        Student student = inputStudentInfo(updateId);
        //通过studentService逐级调用至StudentDao中的updateStudentById()
        studentService.updateStudentById(updateId, student);
        System.out.println("修改成功!");

    }

    //删除学生方法
    public final void deletStudentById() {
        //判断这个id能否查得到
        String delId = inputStudentId();
        //调用业务员中的deleteStudentById根据id, 删除学生
        studentService.deletStudentById(delId);
        //提示删除成功
        System.out.println("删除成功!");
    }

    //添加学生方法
    public final void addStudent() {
        String id;
        //这是一个反复的操作，若学号已存在会一直提示
        while (true) {
            System.out.println("请输入学生id:");
            id = scanner.next();
            //判断这个id是否已经存在，通过studentService的isExists()
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已存在,请重新输入");
            } else {
                break;
            }
        }
        //调用inputStudentInfo(id)并将它封装成一个学生对象
        Student student = inputStudentInfo(id);

        //根据返回的boolean类型结果，在控制台打印成功
        boolean result = studentService.addStudent(student);
        if (result) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }

    //键盘录入学生id
    public final String inputStudentId() {
        String id;
        while (true) {
            System.out.println("请输入学生id:");
            id = scanner.next();
            boolean exists = studentService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("您输入的id不存在,请重新输入:");
            }
        }
        return id;
    }

    //键盘录入学生信息
    //将这个方法定义为抽象方法
    public abstract Student inputStudentInfo(String id);
}
