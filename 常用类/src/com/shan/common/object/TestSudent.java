package com.shan.common.object;

import java.util.Arrays;

public class TestSudent {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", 20);
        Student s2 = new Student("bbb", 22);
        Person s3 = new Person("ccc",25);
        //判断S1,S2是否为同一类型
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();
        Class class3 = s3.getClass();

        System.out.println("============getClass()======================");
        if (class1 == class2) {
            System.out.println("s1,s2 是同一类型");
        }else {
            System.out.println("s1,s2 不是同一类型");
        }


        if (class1 == class3){
            System.out.println("s1,s3 是同一类型");
        }else {
            System.out.println("s1,s3 不是同一类型");
        }

        System.out.println("=================hashCode()=========================");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Student s4 = s1;
        System.out.println(s4.hashCode());
        //hashcode s4 = s1

        System.out.println("=================toString()=========================");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        //可以重写toString()方法，出来的结果不是数组

        System.out.println("=================equals()=========================");
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s4)); //true

        Student eq1 = new Student("xm", 11);
        Student eq2 = new Student("xm", 11);

        System.out.println(eq1.equals(eq2)); //false,地址不同，,重写equals()后true


    }
}
