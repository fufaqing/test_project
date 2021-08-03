package com.itheima.test;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal db1 = new BigDecimal("10.0");
        BigDecimal db2 = new BigDecimal("3.0");

        BigDecimal add = db1.add(db2);
        System.out.println(add);
        BigDecimal subtract = db1.subtract(db2);
        System.out.println(subtract);
        BigDecimal multiply = db1.multiply(db2);
        System.out.println(multiply);
        //当除不尽的时候，会报错，此时应该用divide(BigDecimal对象,取几位,怎么取整)
        // ROUND_FLOOR   舍去
        // ROUND_UP      加一
        // ROUND_HALF_UP 四舍五入
        BigDecimal divide = db1.divide(db2,2,BigDecimal.ROUND_FLOOR);
        System.out.println(divide);

    }
}
