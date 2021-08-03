package com.itheima.test;

import java.util.Arrays;

public class Test4 {
    /*
      已知数组 arr={2,1,3,4,6,5}求：
        1. 定义一个方法getMax获取数组最大值并打印结果到控制台
        2. 定义一个方法getMin获取最小值并打印结果到控制台
        3. 定义一个方法sort实现arr各个元素从小到大排列并打印结果到控制台
     */
    public static void main(String[] args) {
        //已知数组 arr={2,1,3,4,6,5}
        int[] arr = {2, 1, 3, 4, 6, 5};
        //得到最大值
        int max = getMax(arr);
        System.out.println("max="+max);
        //得到最小值
        int min = getMin(arr);
        System.out.println("min="+min);
        //排序
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    //1. 定义一个方法getMax获取数组最大值并打印结果到控制台
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //  2. 定义一个方法getMin获取最小值并打印结果到控制台
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //3. 定义一个方法sort实现arr各个元素从小到大排列并打印结果到控制台
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }


}
