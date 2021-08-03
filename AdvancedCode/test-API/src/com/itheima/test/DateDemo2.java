package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    /*
        开始时间：2020年11月11日 0:0:0
        结束时间：2020年11月11日 0:10:0

        小贾2020年11月11日 0:03:47
        小皮2020年11月11日 0:10:11

        判断两个同学谁抢到了
     */
    //加了异常
    public static void main(String[] args) throws ParseException {
        //先定义一下这个时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //逆解析
        //开始时间startDate
        Date startDate = sdf.parse("2020年11月11日 0:0:0");
        long start = startDate.getTime();

        //结束时间endDate
        Date endDate = sdf.parse("2020年11月11日 0:10:0");
        long end = endDate.getTime();

        //小贾2020年11月11日 0:03:47
        Date people1 = sdf.parse("2020年11月11日 0:03:47");
        long p1Time = people1.getTime();

        //小皮2020年11月11日 0:10:11
        Date people2 = sdf.parse("2020年11月11日 0:10:11");
        long p2Time = people2.getTime();

        System.out.println(start);
        System.out.println(end);
        System.out.println(p1Time);
        System.out.println(p2Time);

        if (p1Time >= start && p1Time <= end){
            System.out.println("恭喜小贾同学抢到了!");
        }

        if (p2Time >= start && p2Time <= end){
            System.out.println("恭喜小皮同学抢到了!");
        }
    }
}
