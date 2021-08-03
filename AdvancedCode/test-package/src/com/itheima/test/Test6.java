package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {

    }
}

class Fu{
    /*
    public Fu(){
        System.out.println("不带参的构造方法!");
    }
    */
    public Fu(int i){
        System.out.println("带参的构造方法!");
    }
}

class Zi extends Fu{
    public Zi(int i) {
        super(i);
    }

}
