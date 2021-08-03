package com.itheima.test_create_class;

public class CreateClassTest2 {
    /*
        成员内部类，也属于成员，既然是成员就可以被修饰符修饰
            private:
                私有成员内部类，在自己所在的外部类中创建对象访问
            static:
                静态成员内部类访问格式：外部类名.内部类名 对象名 = new 外部类名.内部类名;
     */
    public static void main(String[] args) {
        //private的访问
        Outer1 inter1 = new Outer1();
        inter1.method();

        //static的访问
        Outer2.Inter2 inter2 = new Outer2.Inter2();
    }
}

class Outer1 {
    private class Inter1 {
        public void show() {
            System.out.println("Inter1……");
        }
    }

    public void method() {
        Inter1 inter1 = new Inter1();
        inter1.show();
    }
}

class Outer2 {
    static class Inter2 {
        public void show() {
            System.out.println("Inter2……");
        }
    }

}


