package com.shan.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator: 实现定制比较（比较器）
 * Compare: 可比较的
 *
 */
public class Demo05 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }
        });

        Person p1 = new Person("xyz", 22);
        Person p2 = new Person("ab", 24);
        Person p3 = new Person("cd", 25);
        Person p4 = new Person("cc", 25);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println(persons.toString());
    }
}
