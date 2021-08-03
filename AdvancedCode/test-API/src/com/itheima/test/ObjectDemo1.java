package com.itheima.test;

public class ObjectDemo1 {

    public static void main(String[] args) {
        Student student = new Student("张三",23);

        System.out.println(student);
        /*
            public void println(Object x) {
                String s = String.valueOf(x);
                synchronized (this) {
                print(s);
                newLine();
                }
            }

            public static String valueOf(Object var0) {
                return var0 == null ? "null" : var0.toString();
            }

            //相当于调用student.toString
            public String toString() {
                return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
            }

         */
        System.out.println(student.toString());

    }

}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
