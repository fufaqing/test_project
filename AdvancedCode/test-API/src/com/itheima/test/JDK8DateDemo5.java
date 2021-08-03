package com.itheima.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8DateDemo5 {
    /*
        String format(DateTimeFormatter formatter)
            使用指定的格式化程序格式化此日期时间。
        static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
            使用特定的格式化 LocalDateTime从文本字符串获取 LocalDateTime的实例
     */
    public static void main(String[] args) {

        method1();
        method2();

    }

    private static void method2() {
        String str = "2021年07月31日 23:32:07";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(str, formatter);
        System.out.println(parse);
    }

    //将时间解析为想要的格式
    private static void method1() {
        LocalDateTime time = LocalDateTime.of(2021,7,31,23,15,55);
        System.out.println(time);
        //String format(DateTimeFormatter formatter)
        //使用指定的格式化程序格式化此日期时间。
        //要转换的格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = time.format(formatter);
        System.out.println(format);
    }
}
