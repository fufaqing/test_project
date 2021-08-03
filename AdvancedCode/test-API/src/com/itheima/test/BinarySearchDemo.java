package com.itheima.test;

public class BinarySearchDemo {
    /*
        折半查找
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 6;
        //1-想要干什么  --  二分查找
        //2-需要什么   -- 数组、值
        //3-要返回什么  --  索引
        int i = binarySearch(arr, num);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int num) {
        int max = arr.length - 1;
        int min = 0;
        //min <= max
        while (min <= max) {
            int mid = (min + max) / 2;
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
