package com.itheima.test;

public class ObjectDemo2 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("张三",23);
        Teacher teacher2 = new Teacher("张三",23);

        System.out.println(teacher1 == teacher2);//比较的地址值
        //Teacher类要重写toString(),才能比较数据,不然这个equals还是Object的
        System.out.println(teacher1.equals(teacher2));

    }
}

class Teacher{
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (age != teacher.age) return false;
        return name != null ? name.equals(teacher.name) : teacher.name == null;
    }

}
