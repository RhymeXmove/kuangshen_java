package com.shan.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //1. 添加数据
        set.add("小米");
        set.add("华为");
        set.add("苹果");
        System.out.println("数据个数:" + set.size());
        System.out.println(set.toString());
        //2 删除数据
//        set.remove("小米");
        System.out.println("----------------增强for--------------");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("----------------迭代器--------------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
     }


}
