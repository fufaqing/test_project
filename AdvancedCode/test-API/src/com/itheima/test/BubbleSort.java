package com.itheima.test;

import java.util.Arrays;

public class BubbleSort {
    /*
        冒泡排序

     */
    public static void main(String[] args) {
        int[] arr = {22, 66, 33, 55, 11, 44, 77};
        int[] arr1 = method(arr);
        System.out.println(Arrays.toString(arr1));
    }

    //冒泡排序，返回从小到大顺序的数组,
    //需要外循环 arr.length-1次，内循环 arr.length-1-i次

    public static int[] method(int[] arr) {
        //外层循环控制的是次数，比数组的长度少一
        for (int i = 0; i < arr.length - 1; i++) {
            //内存循环就是实际循环比较的
            //-1是为了让数组不要越界
            //-i是每轮结束之后，我们就会少比一个数字
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
