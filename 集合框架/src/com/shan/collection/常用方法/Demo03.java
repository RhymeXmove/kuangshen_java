package com.shan.collection.常用方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
* List常用方法
* */
public class Demo03 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("apple");
        list.add("xiaomi");
        list.add("huawei");
        System.out.println("元素个数:"+ list.size());
        System.out.println(list.toString());

//        list.remove("xiaomi");
//        System.out.println("元素个数:"+ list.size());
//        list.remove(0);
//        System.out.println("元素个数:"+ list.size());

        System.out.println("----------------for遍历-------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------增强for-------------------");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("----------------使用迭代器进行遍历-------------------");
        Iterator it1 = list.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("----------------使用列表迭代器进行正序遍历-------------------");
        ListIterator it2 = list.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        //从后向前
        System.out.println("----------------使用列表迭代器进行逆序遍历-------------------");
        while (it2.hasPrevious()){
            System.out.println(it2.previous());
        }

        System.out.println("-----------------------------------------------------------");
        //判断是否存在
        System.out.println(list.contains("xiaomi"));
        //判断是否为空
        System.out.println(list.isEmpty());

        System.out.println("-----------------------------------------------------------");
        //指定位置输出,含头不含尾
        System.out.println(list.subList(1,2));
    }
}
