package com.shan.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet 保存数据
 * 存储结构 - 红黑树
 * 要求L元素必须要实现Compare接口，compareTo(),方法返回值为0，认为是重复元素
 */

public class Demo04 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        Person p1 = new Person("刘德华", 21);
        Person p2 = new Person("郭富城", 22);
        Person p3 = new Person("梁朝伟", 23);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        treeSet.add(new Person("林志玲", 22));
        System.out.println("元素个数" + treeSet.size());
        System.out.println(treeSet.toString());

        //删除，remove

        //遍历
        for (Person person : treeSet) {
            System.out.println(person);
        }

        //迭代器
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(treeSet.contains(p1));
        System.out.println(treeSet.contains(new Person("林志玲", 22)));

    }
}
