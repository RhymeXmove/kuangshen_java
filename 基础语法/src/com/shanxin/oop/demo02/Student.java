package com.shanxin.oop.demo02;

//学生类
public class Student extends Person {
    //属性字段
    String name;
    Integer age;

    //方法
    public void study() {
        System.out.println(this.name+"在学习");
    }
}
