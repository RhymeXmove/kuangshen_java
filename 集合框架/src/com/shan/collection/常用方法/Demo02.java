package com.shan.collection.常用方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("张无忌", 22);
        Student s3 = new Student("王二", 24);

        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection.toString());

        for (Object o : collection) {
            Student s = (Student) o;
            System.out.println(s);
        }

        System.out.println("-------------------------------");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Student s =(Student) it.next();
            System.out.println(s);
        }

    }
}
