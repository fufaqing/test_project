package com.itheima.test;

import java.util.Arrays;

public class IntegerDemo2 {
    /*
        需求：有一个字符串："91 27 46 38 50",把其中的每一个数都存到int类型的数组中去
     */
    public static void main(String[] args) {
        //有一个字符串："91 27 46 38 50"
        String str = "91 27 46 38 50";
        //用" "分割开
        String[] sArr = str.split(" ");
        //创建int[]
        int[] arr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
