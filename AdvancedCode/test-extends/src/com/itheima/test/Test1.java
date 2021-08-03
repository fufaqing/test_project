package com.itheima.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test1 extends B {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.methodB();
    }
}

class A {
    public void methodA() {
        System.out.println("A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("B");
    }
}