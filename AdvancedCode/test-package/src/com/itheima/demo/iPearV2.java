package com.itheima.demo;

public class iPearV2 extends iPearV1{


    //子类重写父类当中的内容，
    @Override
    public void smallBlack() {
        //既保留了父类的功能
        super.smallBlack();
        //又有子类自己新的功能
        System.out.println("说中文");
    }
}
