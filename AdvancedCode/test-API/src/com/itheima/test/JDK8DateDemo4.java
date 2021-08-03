package com.itheima.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JDK8DateDemo4 {
    /*
        //转换为一个 LocalDate对象 ，只显示日期
        public LocalDate toLocalDate()
        //转换为一个 LocalTime对象 ，只显示时间
        public LocalTime toLocalTime()
     */
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2021,7,31,23,02,59);
        //转换为一个 LocalDate对象 ，只显示日期
        LocalDate localDate = time.toLocalDate();
        System.out.println(localDate);
        //转换为一个 LocalTime对象 ，只显示时间
        LocalTime localTime = time.toLocalTime();
        System.out.println(localTime);
    }
}
