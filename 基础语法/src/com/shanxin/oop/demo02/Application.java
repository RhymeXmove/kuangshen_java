package com.shanxin.oop.demo02;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        //类。抽象的，实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个student类的距离示例

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        xiaoming.study();
        System.out.println("==========================================");


        xh.name = "小红";
        xh.age = 3;

        System.out.println(xh.name);
        System.out.println(xh.age);
        xh.study();


        System.out.println("==========================================");

        Person person = new Person("shanxin");

        System.out.println(person.name);

    }




}
