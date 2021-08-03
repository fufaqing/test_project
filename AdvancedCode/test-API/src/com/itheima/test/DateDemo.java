package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    /*
        Date的构造方法：
            Date()：分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
            Date(long date)：
            分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，
            即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
     */

    public static void main(String[] args) throws ParseException {
        /*
        //创建构造方法
        Date date1 = new Date();//当前时间
        Date date2 = new Date(100L);//1970年01月01日的中国东八区，时区加8嘛，过去（参数）时间的时间
        System.out.println(date1);
        System.out.println(date2);

        //成员方法
        // long getTime()
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        long time = date1.getTime();
        System.out.println(time);

        // void setTime(long time)
        //设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
        date1.setTime(10000L);//1970年01月01日过去多少毫秒后的时间
        System.out.println(date1);

         */
        //把 Date的对象解析为我们想要的时间格式
        Date date = new Date();
        //这是我们通过 SimpleDateFormat定义标准的输入类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //解析，通过 SimpleDateFormat的对象调用 format()
        String format = sdf.format(date);
        System.out.println(format);

        //逆解析，通过 SimpleDateFormat的 parse()返回的是时间对象
        Date date1 = sdf.parse(format);
        System.out.println(date1.getTime());
    }
}
