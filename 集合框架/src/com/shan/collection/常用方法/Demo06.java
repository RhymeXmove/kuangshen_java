package com.shan.collection.常用方法;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Demo06 {
    public static void main(String[] args) {
        //创建集合
        Vector vector = new Vector();
        //添加元素,
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 21);
        Student s3 = new Student("梁朝伟", 22);

        vector.add(s1);
        vector.add(s2);
        vector.add(s3);

        System.out.println("元素个数=" + vector.size());
        System.out.println(vector.toString());


    }
}
