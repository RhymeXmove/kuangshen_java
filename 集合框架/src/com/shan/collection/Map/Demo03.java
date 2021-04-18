package com.shan.collection.Map;

import com.shan.collection.Set.Person;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo03 {
    public static void main(String[] args) {
        TreeMap<Student, String> students = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }
        });
        Student s1 = new Student("孙悟空", 103);
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
