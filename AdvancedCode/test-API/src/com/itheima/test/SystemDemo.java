package com.itheima.test;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
//        static void exit(int status)终止当前正在运行的 Java 虚拟机。
        /*
        System.out.println(111);
        //int status  非 0 的状态码表示异常终止。
        System.exit(0);
        System.out.println(2222);
*/
//        static long currentTimeMillis()返回以毫秒为单位的当前时间。
        //从1970-01-01 00:00:00开始计算的
        /*
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        */

//        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//        从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
        int[] arr1 = {11,22,33};
        int[] arr2 = new int[5];

        System.arraycopy(arr1,1,arr2,0,1);

        System.out.println(Arrays.toString(arr2));

    }
}
