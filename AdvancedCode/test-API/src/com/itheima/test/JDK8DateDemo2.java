package com.itheima.test;

import java.time.LocalDateTime;

public class JDK8DateDemo2 {
    public static void main(String[] args) {
        //使用JDK8获取 LocalDateTime的类，调用.now()得到当前时间
        //把当前时间封装成 年月日时分秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
        //从年，月，日，小时，分钟和秒获得 LocalDateTime的实例，将纳秒设置为零。
        //把指定的时间封装成 年月日时分秒
        LocalDateTime newTime = LocalDateTime.of(2021, 7, 31, 22, 33, 36);
        System.out.println(newTime);

    }
}
