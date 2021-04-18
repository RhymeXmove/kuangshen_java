package com.shan.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap
 * 存储结构：哈希表（数组加链表加红黑树）
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建集合
        HashMap<Student, String> students = new HashMap<>();
        //添加元素
        Student s1 = new Student("孙悟空", 100);
        Student s2 = new Student("猪八戒", 101);
        Student s3 = new Student("沙和尚", 102);
        students.put(s1, "花果山");
        students.put(s2, "黑风洞");
        students.put(s3, "流沙河");
        students.put(s3, "流沙河");
        students.put(new Student("沙和尚", 102), "流沙河");
        System.out.println(students.size());
        System.out.println(students.toString());

        //删除元素
//        students.remove(s1);
//        System.out.println("删除之后：" + students.size());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        //遍历
        for (Student key : students.keySet()) {
            System.out.println(key.toString() + ":" + students.get(key));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        //使用entrySet()
        for (Map.Entry<Student, String> studentStringEntry : students.entrySet()) {
            System.out.println(studentStringEntry.getKey() + ":" + studentStringEntry.getValue());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        //判断
        System.out.println(students.containsKey(s1));
        System.out.println(students.containsValue("流沙河"));
    }
}
