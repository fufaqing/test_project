package com.itheima.test;

import java.time.LocalDateTime;
import java.util.Date;

public class JDK8DateDemo3 {
    /*
        int getYear()   获取年份字段。
        int getMonthValue() 将月份字段从1到12。
        int getDayOfMonth()  获取月份字段。获取月份中第几天
        int getDayOfYear()   获取一年中的第几天
        int getHour()  获取时间字段。
        int getMinute()  获取小时字段。

     */
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.of(2021, 7, 31, 22, 45, 00);

//        int getYear()   获取年份字段。
        int year = time.getYear();
        System.out.println(year);

//        int getMonthValue() 将月份字段从1到12。
        int monthValue = time.getMonthValue();
        System.out.println(monthValue);

//        int getDayOfMonth()  获取月份字段。获取月份中第几天
        int dayOfMonth = time.getDayOfMonth();
        System.out.println(dayOfMonth);

//        int getDayOfYear()   获取一年中的第几天
        int dayOfYear = time.getDayOfYear();
        System.out.println(dayOfYear);

//        int getHour()  获取时间字段。
        int hour = time.getHour();
        System.out.println(hour);

//        int getMinute()  获取小时字段。
        int minute = time.getMinute();
        System.out.println(minute);
    }
}
