package com.shan.collection.泛型;

import com.shan.collection.常用方法.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xxx");
        arrayList.add("yyy");

        for (String s : arrayList) {
            System.out.println(s.toString());
        }

        ArrayList<Student> arrayList2 = new ArrayList<>();
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 21);
        Student s3 = new Student("梁朝伟", 22);
        arrayList2.add(s1);
        arrayList2.add(s2);
        arrayList2.add(s3);

        Iterator iterator = arrayList2.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
