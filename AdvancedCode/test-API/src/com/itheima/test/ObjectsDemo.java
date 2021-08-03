package com.itheima.test;

import java.util.Objects;

public class ObjectsDemo {
    /*
         static String toString(Object o)
            返回非 null参数调用 toString和 "null"参数的 "null"的 null 。

        static String toString(Object o, String nullDefault)
            如果第一个参数不是 null ，则返回第一个参数调用 toString的结果， toString返回第二个参数。

        static boolean isNull(Object obj)
            返回 true如果提供的引用是 null否则返回 false 。

        static boolean nonNull(Object obj)
            退货 true如果提供的参考是非 null否则返回 false 。
         */

    public static void main(String[] args) {
        People people = new People();
//        people = null;

        System.out.println(Objects.toString(people));
        System.out.println(Objects.toString(people, "abc"));

        boolean result1 = Objects.isNull(people);
        boolean result2 = Objects.nonNull(people);

        System.out.println(result1);
        System.out.println(result2);


    }
}

class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}