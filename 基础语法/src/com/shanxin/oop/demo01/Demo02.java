package com.shanxin.oop.demo01;


public class Demo02 {
    public static void main(String[] args) {
        //静态方法
        Student.say();


        //非静态方法
        Student student = new Student();
        student.shout();
    }

}
