package com.itheima.edu.info.manager.entry;
/*
    程序的入口类，提供一个main方法
 */

/*
    需求：
        ·黑马管理系统菜单搭建
        ·学生管理系统菜单搭建

    实现步骤
        1.展示欢迎界面，用输出语句完成主界面的编写
        2.获取用户的选择，用Scanner实现键盘录入数据
        3.根据用户的选择执行对应的操作，用switch语句完成操作的选择

 */

import com.itheima.edu.info.manager.controller.OtherStudentController;
import com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        //创建需要用到的对象
        Scanner scanner = new Scanner(System.in);
        //创建学生的会话客服对象
        //StudentController studentController = new StudentController();
        OtherStudentController studentController = new OtherStudentController();
        //创建学生的会话客服对象
        TeacherController teacherController = new TeacherController();


        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理 2.老师管理 3.退出");
            String choice = scanner.next();
            switch (choice){
                case "1":
                    //开启学生管理系统
                    //System.out.println("学生管理");
                    studentController.start();
                    break;
                case "2":
                    //开启老师管理系统
                    //System.out.println("老师管理");
                    teacherController.start();
                    break;
                case "3":
                    //退出
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }

    }
}
