package com.shan.common.object;

public class TestStudent2 {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", 1);
        Student s2 = new Student("bbb", 2);
        Student s3 = new Student("ccc", 3);
        Student s4 = new Student("ddd", 4);
        Student s5 = new Student("eee", 5);
        Student s6 = new Student("fff", 6);


        new Student("aaa", 1);
        new Student("bbb", 2);
        new Student("ccc", 3);
        new Student("ddd", 4);
        new Student("eee", 5);
        new Student("fff", 6);


        //手动告诉JVM进行回收；
        System.gc();
        System.out.println("回收垃圾");
    }
}
