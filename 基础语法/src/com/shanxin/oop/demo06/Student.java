package com.shanxin.oop.demo06;

public class Student {
    private static int age; //静态变量
    private double score; //非静态变量

    public void run() {

    }

    public static void go() {

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);

        go();
    }

}
