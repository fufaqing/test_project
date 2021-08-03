package com.itheima.test;

import java.util.Arrays;

public class ArraysDemo {

    /*
        Arrays类的使用
            sort(int[] arr);从小到大的排序
            toString(int[] arr);输出数组字符串的拼接
            binarySearch(int[] arr,int key);找这个key在数组中的哪个位置，返回索引值

     */
    public static void main(String[] args) {

        //static void sort(int[] a)
        //对指定的 int 型数组按数字升序进行排序
        int[] arr = {1,3,4,2,9,8,7,6,5};
        Arrays.sort(arr);

        //static String toString(int[] a)
        //返回指定数组内容的字符串表示形式。
        System.out.println(Arrays.toString(arr));// 1 2 3 4 5 6 7 8 9

        //static int binarySearch(int[] a, int key)
        //使用二分搜索法来搜索指定的int 型数组，以获得指定的值。
        System.out.println(Arrays.binarySearch(arr, 8));


    }



}
