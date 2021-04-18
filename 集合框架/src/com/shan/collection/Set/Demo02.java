package com.shan.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合
 * 存储结构：哈希表（数组 + 链表 + 红黑树）
 */
public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("刘德华");
        hashSet.add("郭富城");
        hashSet.add("梁朝伟");

        System.out.println("元素个数：" + hashSet.size());
        System.out.println(hashSet.toString());
        //删除元素
//        hashSet.remove("刘德华");
        //增强for
        System.out.println("---------------增强for-----------------");
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("---------------迭代器-----------------");
        Iterator it= hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
