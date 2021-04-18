package com.shan.collection.常用方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo07 {
    public static void main(String[] args) {
        //创建集合
        LinkedList linkedList = new LinkedList();
        //添加元素,
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 21);
        Student s3 = new Student("梁朝伟", 22);

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        System.out.println("元素个数=" + linkedList.size());
        System.out.println(linkedList.toString());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        for (Object o : linkedList) {
            System.out.println(o.toString());
        }

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
