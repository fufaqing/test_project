package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JDK8DateDemo {
    /*
        将字符串"2020年11月11日 00:00:00"加的日一
     */
    public static void main(String[] args) throws ParseException {

/*
        String str = "2020年11月11日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long time = sdf.parse(str).getTime();
        //加一天
        time = time + (1000 * 60 * 60 * 24);
        Date newDate = new Date(time);
        String newStr = sdf.format(newDate);
        System.out.println(newStr);
*/
        // 用 DateTimeFormatter类
        String str = "2020年11月11日 00:00:00";
        // DateTimeFormatter的 ofPattern()定义格式
        // ofPattern(String pattern)
        // 使用指定的模式创建格式化程序
        DateTimeFormatter patten = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // LocalDateTime的 parse(CharSequence text,, DateTimeFormatter formatter)
        // 使用特定的格式化 LocalDateTime从文本字符串获取 LocalDateTime的实例。
        LocalDateTime localDateTime = LocalDateTime.parse(str, patten);
        // plusDays(long days)
        // 返回此 LocalDateTime的副本，并以指定的时间段添加天数。
        LocalDateTime newLocalDateTime = localDateTime.plusDays(5);
        // format(DateTimeFormatter formatter)
        // 使用指定的格式化程序格式化此日期时间。
        String result = newLocalDateTime.format(patten);
        System.out.println(result);
    }
}
