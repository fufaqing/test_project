package com.itheima.test;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6,1,2,7,3,4,5,10,8};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quick(int[] arr, int left, int right) {
        /*
        if (right<left){
            return;
        }*/
        int left0 = left;
        int right0 = right;
        //基准数
        int baseNumber = arr[left0];
        while (left != right) {
            //从右往左找比基准数小的数
            while (baseNumber <= arr[right] && left < right) {
                right--;
            }
            //从左往右找比基准数大的数
            while (arr[left] <= baseNumber && left < right) {
                left++;
            }
            //交换值
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数交换
        int temp;
        temp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = temp;

        quick(arr, left0, left - 1);
        quick(arr, left + 1, right0);
    }
}
