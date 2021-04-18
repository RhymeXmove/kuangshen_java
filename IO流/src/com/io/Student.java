package com.io;

import java.io.Serializable;

public class Student implements Serializable{

    private static final long serialVersionUID = -8318741215394696905L;
    private String name;
    // 使用transient修饰属性，这个属性就不能序列化；
    // private transient int age;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
