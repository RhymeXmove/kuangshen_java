package com.shanxin.oop.demo09;

//成员内部类
public class Outer {

    private int id = 10;

    public void out() {
        System.out.println("这是外部类的方法");
    }

    //成员内部类
    class Inner {
        public void in() {
            System.out.println("这是成员内部类的方法");
        }

        //获得外部类的私有属性~
        public void getID() {
            System.out.println(id);
        }
    }

    //静态内部类
    public static void B() {

    }

    //局部内部类
    public void method() {
        class Inner {
            public void in() {
                System.out.println("这是局部内部类的方法");
            }
        }
    }
}

//一个java类中可以有多个class类，但是只能有一个public class
//可以在此写测试
//多的一个类
class A {

}
