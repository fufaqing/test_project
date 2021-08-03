package com.itheima.test;

public class Test2 {
    /*
        int[][] arr = {{11, 22, 33}, {77, 88, 99}, {44, 55, 66}};
     */
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {77, 88, 99}, {44, 55, 66}};
        //获取最大值
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

        //获取最小值
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
