package com.itheima.test;

public class ShowHandlerTest {
    public static void main(String[] args) {
        useShowHandler(() -> {
            System.out.println("使用了ShowHandler的show()");
        });
    }

    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}

interface ShowHandler{
    void show();
}