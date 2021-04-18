package com.shan.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet
 * 存储结构：哈希表（数组 + 链表 + 红黑树）
 * 存储过程
 * 1. 根据hashcode 计算保存的位置，如果位置为空，则直接保存，如果不为空执行第二步；
 * 2. 在执行equals 方法，如果equals方法为true, 则认为是重复， 否则， 形成链表；
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        Person p1 = new Person("刘德华", 21);
        Person p2 = new Person("郭富城", 22);
        Person p3 = new Person("梁朝伟", 23);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        //重写 equals, hashcode
        persons.add(new Person("梁朝伟", 23));

        System.out.println("元素个数" + persons.size());
        System.out.println(persons.toString());

        //删除操作
//        persons.remove(p1);
//        persons.remove(new Person("梁朝伟", 23));

        //遍历
        for (Person person : persons) {
            System.out.println(person);
        }

        //迭代器
        Iterator iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(persons.contains(p1));
        System.out.println(persons.contains(new Person("梁朝伟", 23)));

    }
}
