package com.shan.collection.常用方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
* ArrayList
* */
public class Demo05 {
    public static void main(String[] args) {
        //创建集合
        ArrayList arrayList = new ArrayList();
        //添加元素,
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 21);
        Student s3 = new Student("梁朝伟", 22);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        System.out.println("元素个数=" + arrayList.size());
        System.out.println(arrayList.toString());
        //删除
//        arrayList.remove(new Student("郭富城",21));
//        System.out.println(arrayList.toString());
//        arrayList.remove(2);
//        System.out.println(arrayList.toString());

        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            Student s = (Student)it.next(); //强转
            System.out.println(s);
        }

        ListIterator li = arrayList.listIterator();
        while(li.hasNext()){
            Student s = (Student)li.next(); //从前往后遍历
        }

        while(li.hasPrevious()){
            Student s = (Student)li.previous();//从后往前遍历
        }


    }
}
